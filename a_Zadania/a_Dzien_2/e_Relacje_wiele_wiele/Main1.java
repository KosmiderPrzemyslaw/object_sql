package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main1 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
    public String query1 = "create table products_orders\n" +
            "(\n" +
            "    product_id int not null,\n" +
            "    order_id   int not null,\n" +
            "    primary key (product_id, order_id),\n" +
            "    foreign key (order_id) references orders (id),\n" +
            "    foreign key (product_id) references products (id)\n" +
            ")";

    //zapytania łączące produkty z zamówieniami
    public static String query2 = "SELECT p.id AS product_id, p.name AS product_name, p.description AS product_description, p.price AS product_price, o.id AS order_id " +
            "FROM products AS p " +
            "JOIN products_orders AS po ON p.id=po.product_id " +
            "JOIN orders AS o ON po.order_id=o.id " +

            "ORDER BY order_id ASC";

    public String query3 = "";
    public String query4 = "";
    public String query5 = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products_ex?serverTimezone=UTC",
                "coderslab",
                "coderslab")) {

            ResultSet rs = connection.createStatement().executeQuery(query2);

            int previousOrderId = 0;
            while (rs.next()) {
                int currentOrderId = rs.getInt("order_id");

                if (currentOrderId != previousOrderId) {
                    printHeader(currentOrderId);
                    previousOrderId = currentOrderId;
                }

                int productId = rs.getInt("product_id");
                String name = rs.getString("product_name");
                String description = rs.getString("product_description");
                String price = rs.getString("product_price");
                printProduct(productId, name, description, price);
            }

        } catch (SQLException e) {
            System.out.println("Something went terrbily wrong");
        }
    }

    private static void printHeader(int orderId) {
        System.out.println();
        System.out.println("Zamówienie o id " + orderId + ":");
    }

    private static void printProduct(int productId, String name, String description, String price) {
        System.out.println(String.format("Produkt o id: %s, %s, %s, %s zł", productId, name, description, price));
    }
}