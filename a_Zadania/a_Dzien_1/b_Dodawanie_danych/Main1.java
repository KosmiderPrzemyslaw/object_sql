package a_Zadania.a_Dzien_1.b_Dodawanie_danych;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main1 {

    public static String query = "USE products_ex";

    //zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:

    public static String table1row1 = "INSERT INTO clients(name, surname) VALUES('Mariusz', 'Nowak')";
    public static String table1row2 = "INSERT INTO clients(name, surname) VALUES('Mariusz' ,'Max-Kolonko')";
    public static String table1row3 = "INSERT INTO clients(name, surname) VALUES ('Stefan', 'Batory')";
    public static String table1row4 = "INSERT INTO clients(name, surname) VALUES('Krystian', 'Ronaldo')";
    public static String table1row5 = "INSERT INTO clients(name, surname) VALUES('Luis', 'Saha')";


    //zapisz poniżej zapytania dodające rekordy do drugiej tabeli:

    public static String table2row1 = "INSERT INTO orders(description) VALUES ('Bardzo dziwny klient')";
    public static String table2row2 = "INSERT INTO orders(description) VALUES ('Jakis klient')";


    //zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:

    public static String table3row1 = "INSERT INTO products (name, description, price) VALUES('banany', 'banany z wat', 125.23)";
    public static String table3row2 = "INSERT INTO products (name, description, price) VALUES('pomarancz', 'pom z wat', 23)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.executeUpdate(table1row1);
            statement.executeUpdate(table1row2);
            statement.executeUpdate(table1row3);
            statement.executeUpdate(table2row1);
            statement.executeUpdate(table2row2);
            statement.executeUpdate(table3row1);
            statement.executeUpdate(table3row2);
            statement.executeUpdate(table1row4);
            statement.executeUpdate(table1row5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
