package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


import c_Snippety.InputUtil;
import a_Zadania.a_Dzien_1.c_Pobieranie_danych.PrintUtil;

import java.sql.*;

public class Main2 {

    private static String ticketsQuery = "SELECT id, price, quantity FROM tickets";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {

            printAvailableTickets(connection);

            int ticketId = askUserAboutTicketId();
            int count = askUserAboutTicketsCount();

            buyTickets(ticketId, count, connection);

        } catch (SQLException e) {
            System.out.println("An error has occured: " + e);
        }
    }

    private static int askUserAboutTicketsCount() {
        return InputUtil.askForValidNumber("Type desired count of tickets: ");
    }

    private static int askUserAboutTicketId() {
        return InputUtil.askForValidNumber("Type ID of the ticket: ");
    }

    private static void buyTickets(int ticketId, int count, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE tickets SET quantity = quantity - ? WHERE id = ?");
        preparedStatement.setInt(1, count);
        preparedStatement.setInt(2, ticketId);

        int affectedRows = preparedStatement.executeUpdate();

        if (affectedRows == 1) {
            System.out.println("Successfully bought " + count + " tickets!");
        } else if (affectedRows == 0) {
            System.out.println("Didn't find a ticket with id " + ticketId);
        } else {
            throw new IllegalStateException("Found more than one ticket with ID " + ticketId);
        }
    }

    private static void printAvailableTickets(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(ticketsQuery);

        PrintUtil.print(rs, "id", "price", "quantity");
    }
}
