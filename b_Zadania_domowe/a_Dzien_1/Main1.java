package b_Zadania_domowe.a_Dzien_1;


import a_Zadania.a_Dzien_1.c_Pobieranie_danych.PrintUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main1 {

    // public static String query = "USE coderslab";

    public static String query1 = "SELECT * FROM users WHERE name LIKE 'Julia %'";

    public static String query2 = "SELECT email FROM users ORDER by email DESC LIMIT 5";

    public static String query3 = "SELECT email, name FROM users WHERE email LIKE '%@yahoo.com%' AND " +
            "name LIKE 'L%' ";
    public static String query4 = "SELECT name FROM users WHERE password like SHA2(CONCAT(name, salt), 256)";


    public static String query5 = "SELECT id, title FROM offers WHERE price > 500000";

    public static String query6 = "SELECT id, price FROM offers WHERE activation_token = '' AND price " +
            "BETWEEN '2000' AND '400000'";

    public static String query7 = "SELECT title, price, phone " +
            "FROM offers " +
            "WHERE expire BETWEEN NOW() AND DATE_ADD(NOW(), INTERVAL 10 DAY) AND status = 1";

    public static String query8 = "SELECT description, phone, price " +
            "FROM offers " +
            "WHERE description LIKE '%violent%' AND phone LIKE '%2%' AND price > 50000";

    public static String query9 = "SELECT * FROM offers WHERE promoted = 0 AND price > 50000 " +
            "AND title like '%LLC'";

    public static String query10 = "SELECT price, promoted, promoted_to " +
            "FROM offers " +
            "WHERE price < price *2 AND promoted = 1 AND promoted_to > CURRENT_DATE";

   public static String query11 = "SELECT COUNT(*) AS sum_active FROM offers" +
           " WHERE status = 1 AND expire > NOW()";

    public static String query12 = "SELECT owner, COUNT(*) AS sum_user FROM offers" +
            " WHERE status = 1 AND expire > NOW() GROUP BY OWNER ";

    public static String query13 = "SELECT status AS type, COUNT(status) AS counter FROM offers " +
            "WHERE status = 1 OR status = 2 GROUP BY status ORDER BY type";


    public static String query14 = "SELECT SUM(price) AS sum_nonactive_nonpromoted FROM " +
            "offers WHERE status = 1 AND expire < NOW() AND promoted = 0;";

    public static String query15 = "SELECT ROUND(AVG(price), 2) AS avg_price FROM offers WHERE" +
            " expire > NOW() AND promoted = 1 AND price > 44645.04";

        public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/coderslab?serverTimezone=UTC",
                "root",
                "coderslab"
        )) {
            //Statement statement = connection.createStatement();
            //ResultSet resultSet = connection.createStatement().executeQuery(query);

            ResultSet resultSet1 = connection.createStatement().executeQuery(query1);
            PrintUtil.print(resultSet1, "name");

            ResultSet resultSet2 = connection.createStatement().executeQuery(query2);
            PrintUtil.print(resultSet2, "email");

            ResultSet resultSet3 = connection.createStatement().executeQuery(query3);
            PrintUtil.print(resultSet3, "email", "name");

            ResultSet resultSet4 = connection.createStatement().executeQuery(query4);
            PrintUtil.print(resultSet4, "name");

            ResultSet resultSet5 = connection.createStatement().executeQuery(query5);
            PrintUtil.print(resultSet5, "id", "title");

            ResultSet resultSet6 = connection.createStatement().executeQuery(query6);
            PrintUtil.print(resultSet6, "id", "price");

            ResultSet resultSet7 = connection.createStatement().executeQuery(query7);
            PrintUtil.print(resultSet7, "title", "price", "phone");

            ResultSet resultSet8 = connection.createStatement().executeQuery(query8);
            PrintUtil.print(resultSet8, "description", "phone", "price");

            ResultSet resultSet9 = connection.createStatement().executeQuery(query9);
            PrintUtil.print(resultSet9, "id");

            ResultSet resultSet10 = connection.createStatement().executeQuery(query10);
            PrintUtil.print(resultSet10,"price", "promoted", "promoted_to");

            ResultSet resultSet11 = connection.createStatement().executeQuery(query11);
            PrintUtil.print(resultSet11, "sum_active");

            ResultSet resultSet12 = connection.createStatement().executeQuery(query12);
            PrintUtil.print(resultSet12, "sum_user");

            ResultSet resultSet13 = connection.createStatement().executeQuery(query13);
            PrintUtil.print(resultSet13, "type", "counter");

            ResultSet resultSet14 = connection.createStatement().executeQuery(query14);
            PrintUtil.print(resultSet14, "sum_nonactive_nonpromoted");

            ResultSet resultSet15 = connection.createStatement().executeQuery(query15);
            PrintUtil.print(resultSet15, "avg_price");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
