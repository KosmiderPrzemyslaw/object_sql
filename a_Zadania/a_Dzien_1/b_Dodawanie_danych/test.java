/*package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

import a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel.Main4;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/products_ex?serverTimezone=UTC",
                "root",
                "coderslab")) {

            Statement statement = connection.createStatement();
            //statement.executeUpdate(query);
            statement.executeUpdate(Main1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
}
*/