package b_Zadania_domowe.a_Dzien_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
    public static String createTableImagesQuery = "CREATE TABLE images\n" +
            "(\n" +
            "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    offer_id INT UNSIGNED,\n" +
            "    src VARCHAR(100),\n" +
            "    dimension VARCHAR(10)\n" +
            ");";

    public static String createTableUsersCompaniesQuery = "CREATE TABLE users_companies " +
            "(\n" +
            "id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY," +
            "user_id INT UNSIGNED UNIQUE," +
            "name VARCHAR(30)," +
            "nip INT," +
            "street VARCHAR(50)," +
            "street_nr MEDIUMINT," +
            "phone CHAR(9)," +
            "post_code CHAR(6)," +
            "capital DECIMAL(7, 2)," +
            "rate DECIMAL(5, 4)," +
            "created_at DATETIME)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/coderslab?serverTimezone=UTC",
                "root",
                "coderslab"
        )) {
            Statement statement = connection.createStatement();
            //statement.executeUpdate(createTableImagesQuery);

            statement.executeUpdate(createTableUsersCompaniesQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


