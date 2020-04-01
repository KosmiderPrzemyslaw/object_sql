package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.*;

public class Main1 {
    //Zapisz w poniższej zmiennej kod zapytania SQL pobierającego odpowiednie dane
    public static String query = "USE products_ex";

    public static String printProducts = "SELECT id, name, substring(description, 1, 20) AS descr," +
            "length(description) as descr_length, price FROM products";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products_ex?serverTimezone=UTC",
                "root",
                "coderslab"
        )) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            ResultSet resultSet = statement.executeQuery(printProducts);

            while (resultSet.next()) {
                System.out.println(String.format("Produkt: [id: %s, name: %s, description: %s, " +
                                "price: %s]",
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("descr") + (resultSet.getInt("descr_length") > 20
                                ? "..." : ""),
                        resultSet.getString("price")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

