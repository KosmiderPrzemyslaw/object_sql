package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "UPDATE cinemas SET name = 'Stadion Narodowy' WHERE name LIKE '%Z'";
    public String query2 = "DELETE FROM payments WHERE CAST(payment_date AS DATETIME) < DATE_SUB(NOW(), INTERVAL 4 DAY)";
    public String query3 = "UPDATE movies SET rating = 5.4 WHERE LENGTH(description) > 40";
    public String query4 = "UPDATE tickets SET price = 0.5 * price WHERE quantity > 10";

}