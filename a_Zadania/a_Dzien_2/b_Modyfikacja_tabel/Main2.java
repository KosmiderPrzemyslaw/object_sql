package a_Zadania.a_Dzien_2.b_Modyfikacja_tabel;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "ALTER TABLE movies ADD COLUMN watchCount int";
    public String query2 = "ALTER TABLE movies ADD COLUMN isTop tinyint NOT NULL DEFAULT 0";
    public String query3 = "ALTER TABLE cinemas ADD COLUMN openTime time";
    public String query4 = "ALTER TABLE cinemas ADD COLUMN closeTime time";

}
