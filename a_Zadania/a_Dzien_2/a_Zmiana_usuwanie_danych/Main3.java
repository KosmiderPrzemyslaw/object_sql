package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


public class Main3 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "DELETE FROM movies WHERE id = 4";
    public String query2 = "DELETE FROM cinemas WHERE lower(name) = lower('helios')";
    public String query3 = "UPDATE tickets SET quantity = 10";
    public String query4 = "DELETE FROM payments WHERE payment_date < '2017-01-01'";

}