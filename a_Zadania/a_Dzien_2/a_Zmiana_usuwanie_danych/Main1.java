package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import a_Zadania.a_Dzien_1.c_Pobieranie_danych.PrintUtil;

import java.math.BigDecimal;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {

            printAllMoviesOnScreen(connection);

            int movieToRemoved = askUserAboutMovieToBeRemoved();
            removeChosenMovie(connection, movieToRemoved);

            printAllCinemasOnScreen(connection);

            printSelectPaymentsOnScreen(connection);



            String moviesTitle = askUserAboutMovieToBeAdd("Enter new movie: ");
            String moviesDescription = askUserAboutMovieDescription("Describe movie: ");
            BigDecimal rating = askUserAboutRating("Rate the movie: ");

            addMovie(connection, moviesTitle, moviesDescription, rating);


            printAllMoviesOnScreen(connection);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addMovie(Connection connection, String addMovie, String moviesDescription,
                                 BigDecimal rating) throws SQLException {
        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO movies (title, description, rating) VALUES (?, ?, ?)");
        preparedStatement.setString(1, addMovie);
        preparedStatement.setString(2, moviesDescription);
        preparedStatement.setBigDecimal(3, rating);

        int ileDodano = preparedStatement.executeUpdate();

        if (ileDodano == 1) {
            System.out.println("Pomyślnie dodano film: " + addMovie);
        }
        if (ileDodano == 0) {
            System.out.println("Nie udało się dodać filmu");
        }
        if (ileDodano > 1) {
            System.out.println("Dodano więcej niz 1 film");
        }
    }

    private static void removeChosenMovie(Connection connection, int doUsuniecia) throws SQLException {
        PreparedStatement preparedStatement = connection
                .prepareStatement("DELETE FROM movies WHERE id = ?");
        preparedStatement.setInt(1, doUsuniecia);

        int ileUsunieto = preparedStatement.executeUpdate();

        if (ileUsunieto == 1) {
            System.out.println("Pomyslnie usunieto film o id: " + doUsuniecia);
        }

        if (ileUsunieto == 0) {
            System.out.println("Nie udalo sie usunac filmu.");
        }

        if (ileUsunieto > 1) {
            System.out.println("Illegal State - more than one movie removed");
        }
    }

    private static int askUserAboutMovieToBeRemoved() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ID filmu do usuniecia: ");
        return scanner.nextInt();
    }

    private static String askUserAboutMovieDescription(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()) {
            scanner.next();
            System.out.print("Napis nie zgodny ze wzorcem");
        }
        return scanner.nextLine();
    }

    private static BigDecimal askUserAboutRating(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextBigDecimal()) {
            scanner.next();
            System.out.println("Wartość niezgodna ze wzrocem");
            System.out.println(prompt);
        }
        return scanner.nextBigDecimal();
    }


    private static String askUserAboutMovieToBeAdd(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()) {
            scanner.next();
            System.out.print("Napis nie zgodny ze wzorcem");
        }
        return scanner.nextLine();

    }

    private static void printAllCinemasOnScreen(Connection connection) throws SQLException {
        ResultSet rs1 = connection.createStatement()
                .executeQuery("SELECT id, name, addresses FROM cinemas");
        PrintUtil.print(rs1, "id", "name", "addresses");
    }

    private static void printSelectPaymentsOnScreen(Connection connection) throws SQLException {
        ResultSet resultSet = connection.createStatement()
                .executeQuery("SELECT * FROM payments WHERE type LIKE 'cash' ORDER BY payment_date DESC ");
        PrintUtil.print(resultSet, "id", "type", "payment_date");
    }

    private static void printAllMoviesOnScreen(Connection connection) throws SQLException {
        ResultSet rs1 = connection.createStatement()
                .executeQuery("SELECT id, title, description, rating FROM movies");
        PrintUtil.print(rs1, "id", "title", "description", "rating");
    }
}