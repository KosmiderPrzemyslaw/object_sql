package a_Zadania.a_Dzien_1.c_Pobieranie_danych;


import java.sql.*;

public class Main2 {

    private static String query = "SELECT id, title, rating FROM movies" +
            " WHERE rating > (SELECT AVG(rating) FROM movies)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Filmy z ratingiem wiekszym niz sredni rating: ");


            PrintUtil.print(resultSet, "id", "title", "rating");

           /* while (resultSet.next()) {
                System.out.println(resultSet.getString("title") + ": " +
                        resultSet.getDouble("rating"));
            }

            */
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}