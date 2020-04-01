package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {

    public static String query = "USE cinemas_ex";

    //zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:"INSERT INTO movies(id, rating, title) VALUES(null, \"bardzo dobry\", \"Szybcy i wściekli\")"
    public static String table1row1 = "INSERT INTO cinemas(name, addresses) VALUES ('Multikino', 'Gliwice')";
    public static String table1row3 = "INSERT INTO cinemas(name, addresses) VALUES('CinemaCity', 'Warszawa 3')";
    public static String table1row4 = "INSERT INTO cinemas(name, addresses) VALUES('Casino', 'Katowice')";
    public static String table1row2 = "INSERT INTO cinemas(name, addresses) VALUES('Kino', 'Rzeszow')";
    public static String table1row5 = "INSERT INTO cinemas(name, addresses) VALUES('Abc', 'Rybnik')";


    //zapisz poniżej zapytania dodające rekordy do drugiej tabeli:
    public static String table2row1 = "INSERT INTO movies(title, description, rating) VALUES ('T1', 'opis1', 4.0)";
    public static String table2row2 = "INSERT INTO movies(title, description, rating) VALUES ('T2', 'opis2', 5.0)";
    public static String table2row3 = "INSERT INTO movies(title, description, rating) VALUES ('T3', 'opis3', 6.0)";
    public static String table2row4 = "INSERT INTO movies(title, description, rating) VALUES ('T4', 'opis4', 7.0)";
    public static String table2row5 = "INSERT INTO movies(title, description, rating) VALUES ('T5', 'opis5', 10.23)";


    //zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:
    public static String table3row1 = "INSERT INTO payments(type, payment_date) VALUES('cash', NOW())";
    public static String table3row2 = "INSERT INTO payments(type, payment_date) VALUES('card', NOW())";
    public static String table3row3 = "INSERT INTO payments(type, payment_date) VALUES('transfer', NOW())";
    public static String table3row4 = "INSERT INTO payments(type, payment_date) VALUES('cash', NOW())";
    public static String table3row5 = "INSERT INTO payments(type, payment_date) VALUES('transfer', NOW())";


    //zapisz poniżej zapytania dodające rekordy do czwartej tabeli:
    public static String table4row1 = "INSERT INTO tickets(quantity, price) VALUES(1, 5)";
    public static String table4row2 = "INSERT INTO tickets(quantity, price) VALUES(2, 10)";
    public static String table4row3 = "INSERT INTO tickets(quantity, price) VALUES(3, 15)";
    public static String table4row4 = "INSERT INTO tickets(quantity, price) VALUES(4, 20)";
    public static String table4row5 = "INSERT INTO tickets(quantity, price) VALUES(5, 25)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?serverTimezone=UTC",
                "root",
                "coderslab"
        )) {
            Statement statement = connection.createStatement();

            statement.executeUpdate(query);
            statement.executeUpdate(table1row1);
            statement.executeUpdate(table1row2);
            statement.executeUpdate(table1row3);
            statement.executeUpdate(table1row4);
            statement.executeUpdate(table1row5);

            statement.executeUpdate(table2row1);
            statement.executeUpdate(table2row2);
            statement.executeUpdate(table2row3);
            statement.executeUpdate(table2row4);
            statement.executeUpdate(table2row5);

            statement.executeUpdate(table3row1);
            statement.executeUpdate(table3row2);
            statement.executeUpdate(table3row3);
            statement.executeUpdate(table3row4);
            statement.executeUpdate(table3row5);

            statement.executeUpdate(table4row1);
            statement.executeUpdate(table4row2);
            statement.executeUpdate(table4row3);
            statement.executeUpdate(table4row4);
            statement.executeUpdate(table4row5);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}