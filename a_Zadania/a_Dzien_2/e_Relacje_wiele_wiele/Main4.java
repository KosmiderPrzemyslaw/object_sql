package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main4 {

    private static String query = "SELECT m.id AS movie_id, c.id AS cinema_id, m.title, c.name " +
            "FROM movies AS m " +
            "JOIN cinemas_movies AS cm ON cm.movie_id = m.id " +
            "JOIN cinema AS c ON c.id = cm.cinema_id " +
            "WHERE m.title = 'Titanic' " +

            "ORDER BY movie_id";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products_ex?serverTimezone=UTC",
                "coderslab",
                "coderslab")) {

            ResultSet rs = connection.createStatement().executeQuery(query);

            int previousMovieId = 0;
            while (rs.next()) {
                int currentMovieId = rs.getInt("movie_id");

                if (currentMovieId != previousMovieId) {
                    printHeader(currentMovieId);
                    previousMovieId = currentMovieId;
                }

                int cinemaId = rs.getInt("cinema_id");
                printCinema(cinemaId);
            }

        } catch (SQLException e) {
            System.out.println("Something went terribly wrong");
        }
    }

    private static void printHeader(int movieId) {
        System.out.println();
        System.out.println("Film o id " + movieId + ":");
    }

    private static void printCinema(int cinemaId) {
        System.out.println("* Kino o id " + cinemaId);
    }

}