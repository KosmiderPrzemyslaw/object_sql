package b_Zadania_domowe.a_Dzien_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
    public static String queryAddImages1 = "INSERT INTO " +
            "images(offer_id, src, dimension) VALUES(1, 'http://strona.pl/ images1', '200x300')";
    public static String queryAddImages2 = "INSERT INTO " +
            "images(offer_id, src, dimension) VALUES(2, 'http://strona.pl/ images2', '300x400')";
    public static String queryAddImages3 = "INSERT INTO " +
            "images(offer_id, src, dimension) VALUES(3, 'http://strona.pl/ images3', '400x500')";
    public static String queryAddImages4 = "INSERT INTO " +
            "images(offer_id, src, dimension) VALUES(4, 'http://strona.pl/ images4', '250x350')";
    public static String queryAddImages5 = "INSERT INTO " +
            "images(offer_id, src, dimension) VALUES(5, 'http://strona.pl/ images5', '360x360')";

    public static String queryAddCompany1 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr," +
            "phone, post_code, capital, rate, created_at) VALUES(1, 'Adidas', 1549549541," +
            "'Targowa', 6, '11111111', '44-223', 15000.00, 8.977, '2019-05-05')";
    public static String queryAddCompany2 = "INSERT INTO " +
            "users_companies(user_id, name, nip, street, street_nr, nip, street, street_nr," +
            "phone, post_code, capital, rate, created_at) VALUES(1, 'Adidas', 1549549541," +
            "'Targowa', 6, '11111111', '44-223', 15000.00, 8.977, '2019-05-05')";
   /* public static String queryAddCompany2 = "INSERT INTO " +
            "users_companies(user_id, name, nip, street, street_nr, phone,\n" +
            "post_code, capital, rate, created_at) VALUES(2, 'Reebok',\n" +
            "\n" +
            "1549549542, 'Kolejowa', 9, '222222222', '40-101', 25000.00, 7.975,\n" +
            "'2019-06-05')";

    */
    public static String queryAddCompany3 = "INSERT INTO " +
            "users_companies(user_id, name, nip, street, street_nr, phone,\n" +
            "post_code, capital, rate, created_at) VALUES(3, 'Nike',\n" +
            "1549549543, 'Wawelska', 1, '333333333', '40-111', 5000.00, 6.997,\n" +
            "'2019-07-05')";
    public static String queryAddCompany4 = "INSERT INTO " +
            "users_companies(user_id, name, nip, street, street_nr, phone,\n" +
            "post_code, capital, rate, created_at) VALUES(4, 'Puma',\n" +
            "1549549544, 'Katowicka', 5, '444444444', '40-201', 35055.00,\n" +
            "9.977, '2019-06-25')";
    public static String queryAddCompany5 = "INSERT INTO " +
            "users_companies(user_id, name, nip, street, street_nr, phone,\n" +
            "post_code, capital, rate, created_at) VALUES(5, '4F', 1549549545,\n" +
            "'Opolska', 2, '555555555', '40-331', 77000.00, 8.525,\n" +
            "'2019-07-09')";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/coderslab?serverTimezone=UTC",
                "root",
                "coderslab")) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(queryAddImages1);
            statement.executeUpdate(queryAddImages2);
            statement.executeUpdate(queryAddImages3);
            statement.executeUpdate(queryAddImages4);
            statement.executeUpdate(queryAddImages5);
            statement.executeUpdate(queryAddCompany1);
            statement.executeUpdate(queryAddCompany2);
            statement.executeUpdate(queryAddCompany3);
            statement.executeUpdate(queryAddCompany4);
            statement.executeUpdate(queryAddCompany5);
        } catch (
                SQLException e) {
            e.printStackTrace();

        }
    }
}
