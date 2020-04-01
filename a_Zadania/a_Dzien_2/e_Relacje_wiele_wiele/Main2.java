package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {

    private static String query = "SELECT p.id AS product_id, o.id AS order_id " +
            "FROM products AS p " +
            "JOIN products_orders AS po ON p.id=po.product_id " +
            "JOIN orders AS o ON po.order_id=o.id " +

            "ORDER BY product_id ASC";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products_ex?serverTimezone=UTC",
                "coderslab",
                "coderslab")) {

            ResultSet rs = connection.createStatement().executeQuery(query);

            int previousProductId = 0;
            while (rs.next()) {
                int currentProductId = rs.getInt("product_id");

                if (currentProductId != previousProductId) {
                    printHeader(currentProductId);
                    previousProductId = currentProductId;
                }

                int orderId = rs.getInt("order_id");
                printOrder(orderId);
            }

        } catch (SQLException e) {
            System.out.println("Something went terribly wrong");
        }
    }


    private static void printHeader(int productId) {
        System.out.println();
        System.out.println("Product o id " + productId + ":");
    }

    private static void printOrder(int orderId) {
        System.out.println(String.format("Zamowienie o id: %s", orderId));
    }

}