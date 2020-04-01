package a_Zadania.a_Dzien_1.c_Pobieranie_danych;


import java.sql.*;

public class Main3 {
    private static String query = "USE cinemas_ex";
    private static String query1 = "SELECT id, title FROM movies WHERE title LIKE 'w%'";
    private static String query2 = "SELECT id, price, quantity FROM tickets WHERE price > 15.30";
    private static String query3 = "SELECT id, quantity FROM tickets WHERE quantity > 3";
    private static String query4 = "SELECT id, title, rating FROM movies WHERE rating > 6.5";
    private static String query5 = "SELECT id, title, description, rating FROM movies ORDER BY rating DESC LIMIT 5";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {


            Statement statement = connection.createStatement();
            statement.executeQuery(query);

            ResultSet rs5 = statement.executeQuery(query5);

            while (rs5.next()) {
                System.out.println(String.format("Film: [id: %s, title %s, description: %s, rating: %s]",
                        rs5.getString("id"),
                        rs5.getString("title"),
                        rs5.getString("description"),
                        rs5.getString("rating")));
            }

            ResultSet rs2 = statement.executeQuery(query2);

            while (rs2.next()) {
                System.out.println(String.format("Bilety: [id: %s, quantity: %s, price: %s]",
                        rs2.getString("id"),
                        rs2.getString("quantity"),
                        rs2.getString("price")));
            }

            ResultSet rs4 = statement.executeQuery(query4);

            while (rs4.next()) {
                System.out.println(String.format("Films with rating bigger than 6.5: " +
                                "[id: %s, title: %s, rating: %s]",
                        rs4.getString("id"),
                        rs4.getString("title"),
                        rs4.getString("rating")));
            }

            ResultSet rs3 = statement.executeQuery(query3);
            PrintUtil.print(rs3, "id", "quantity");

            ResultSet rs1 = statement.executeQuery(query1);
            PrintUtil.print(rs1, "id", "title");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}