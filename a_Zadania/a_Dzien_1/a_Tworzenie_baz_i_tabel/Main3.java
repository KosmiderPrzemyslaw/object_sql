package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
    //Zapisz w poniższej zmiennej kod zapytania SQL
    public static String query = "USE cinemas_ex";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {
            Statement statement = connection.createStatement();

            statement.executeUpdate(query);
            statement.executeUpdate(Main4.queryCreateTableTickets);
            statement.executeUpdate(Main4.queryCreateTablePayments);
            statement.executeUpdate(Main4.queryCreateTableMovies);
            statement.executeUpdate(Main4.queryCreateTableCinemas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

