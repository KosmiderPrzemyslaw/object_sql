package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

public class Main2 {

    public String query1 = "INSERT INTO products SET id=0, name=produkt1, description=name, price=904";
    public String query1fixed = "INSERT INTO products(name, description, price) VALUES ('produkt1','name', price=904)";

    public String query2 = "INSERT INTO clients VALUES(\"Jan\", \"Kowalski\", 4, \"Mr.\")";
    public String query2fixed = "INSERT INTO products(name, surname, id) VALUES ('Jan','Kowalski', 4)";

    public String query3 = "INSERT INTO movies(id, rating, title) VALUES(null, \"bardzo dobry\", \"Szybcy i wściekli\")";
    public String query3fixed = "INSERT INTO movies(rating, title) VALUES(5.00, 'Szybcy i wściekli')";

    public String query4 = "INSERT INTO payments(id, type, payment_date) VALUES(90, 'cash', NOW())";
    public String query4fixed = "";
}
