package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


import a_Zadania.a_Dzien_1.c_Pobieranie_danych.PrintUtil;
import c_Snippety.InputUtil;


import java.sql.*;

import static c_Snippety.InputUtil.askUser;

public class Main5 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {
            while (true) {

                printCinemas(connection);

                String choice = InputUtil.askUser("Your choice: ");

                switch (choice.toLowerCase()) {
                    case "x": {
                        System.out.println("Bye bye!");
                        return;
                    }
                    case "e": {
                        askAndModifyRecord(connection);
                        break;
                    }
                    case "u": {
                        askAndRemoveRecord(connection);
                        break;
                    }
                    default: {
                        System.out.println("Unknown choice!");
                        break;
                    }
                }

            }
        } catch (SQLException e) {
            System.out.println("Something went terribly wrong");
        }
    }

    private static void printCinemas(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT id, name, addresses FROM cinemas");
        PrintUtil.print(rs, "id", "name", "addresses");
    }

    private static void askAndRemoveRecord(Connection connection) throws SQLException {
        int id = InputUtil.askForValidNumber("Type ID of the cinema to be removed: ");

        String answer = InputUtil.askUser("Are you sure to remove the cinema with ID: " + id + "? Type 'T' to confirm: ");

        if ("T".equalsIgnoreCase(answer)) {
            removeCinema(connection, id);
        } else {
            System.out.println("OK, no problem - didn't touch anything!");
        }
    }

    private static void askAndModifyRecord(Connection connection) throws SQLException {
        int id = InputUtil.askForValidNumber("Type ID of the cinema to be modified: ");

        String name = askUser("Type new name: ");
        String addresses = askUser("Type new address: ");

        updateCinema(connection, id, name, addresses);
    }

    private static void removeCinema(Connection connection, int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM cinemas WHERE id = ?");
        preparedStatement.setInt(1, id);
        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows == 1) {
            System.out.println("Successfully removed cinema with ID: " + id);
        } else {
            System.out.println("Something went wrong - the cinema ID: " + id + " was not removed");
        }
    }

    private static void updateCinema(Connection connection, int id, String name, String addresses) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE cinemas SET name = ?, addresses = ? WHERE id = ?");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, addresses);
        preparedStatement.setInt(3, id);

        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows == 1) {
            System.out.println("Successfully edited cinema with ID: " + id);
        } else {
            System.out.println("Something went wrong - the cinema ID: " + id + " was not edited");
        }
    }
}