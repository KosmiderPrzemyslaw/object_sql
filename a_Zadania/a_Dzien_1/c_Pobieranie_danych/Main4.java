package a_Zadania.a_Dzien_1.c_Pobieranie_danych;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//
public class Main4 {
    //zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT SUM(quantity) as sumOfTickets FROM tickets";
    public static String query2 = "SELECT type, COUNT(*) AS paymentsByType FROM payments GROUP BY type";
    public static String query3 = "SELECT AVG(price) AS avgPrice FROM tickets";
    public static String query4 = "SELECT id, type, payment_date FROM payments ORDER BY payment_date DESC," +
            "id DESC LIMIT 1, 5";
    public static String query5 = "SELECT type, COUNT(*) as countByType FROM payments" +
            " GROUP BY type HAVING countByTYpe > 2";
    //5. listę wszystkich płatności (pogrupowanych po kolumnie `type`), których liczba będzie większa niż 2,
    public static String query6 = "SELECT SUM(quantity) as sumOfTickets FROM tickets WHERE price > 23.15";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {

            ResultSet rs1 = connection.createStatement().executeQuery(query1);

            PrintUtil.print(rs1, "sumOftickets");

            ResultSet rs2 = connection.createStatement().executeQuery(query2);
            PrintUtil.print(rs2, "type", "paymentsByType");

            ResultSet rs3 = connection.createStatement().executeQuery(query3);
            PrintUtil.print(rs3, "avgPrice");

            ResultSet rs4 = connection.createStatement().executeQuery(query4);
            PrintUtil.print(rs4, "id", "type", "payment_date");

            ResultSet rs5 = connection.createStatement().executeQuery(query5);
            PrintUtil.print(rs5, "type", "countByType");

            ResultSet rs6 = connection.createStatement().executeQuery(query6);
            PrintUtil.print(rs6, "sumOfTickets");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}