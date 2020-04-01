package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    //Zapisz w poniższej zmiennej kod zapytania SQL
    public static String query = "CREATE DATABASE product_ex";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/product_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {
            Statement statement = connection.createStatement();

            statement.executeUpdate(Main2.queryCreateTableProducts);
            statement.executeUpdate(Main2.queryCreateTableClients);
            statement.executeUpdate(Main2.queryCreateTableOrders);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


