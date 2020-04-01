package a_Zadania.a_Dzien_1.b_Dodawanie_danych;


import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;

import java.sql.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id of cinema to be added: ");
        int id = scanner.nextInt();

        System.out.print("Enter the name of cinema to be added:");
        String name = scanner.next();

        System.out.print("Enter address of new cinema: ");
        String address = scanner.next();

        addCinema(id, name, address);

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter your id to add payment: ");
        int userId = scanner1.nextInt();

        System.out.print("Enter your name: ");
        String userName = scanner1.next();

        System.out.print("Enter amount: ");
        double userAmount = scanner1.nextDouble();

        addUserPayment(userId, userName, userAmount);


        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter your id: ");
        int id2 = scanner2.nextInt();

        System.out.print("Enter your name: ");
        String name2 = scanner2.next();

        System.out.print("Enter number of overtime worked: ");
        int amount = scanner2.nextInt();

        addHours(id2, name2, amount);


    }

    static void addCinema(int id, String name, String address) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO cinemas(id, name, addresses) " +
                            "VALUES (?,?,?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addUserPayment(int id, String name, double amount) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab"
        )) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO vip(id, name, amount) " +
                            "VALUES(?,?,?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, amount);

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addHours(int id, String name, int amount) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab"
        )) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO godzinyPracy (id, name, amount)" +
                            "VALUES (?,?,?)");

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, amount);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}