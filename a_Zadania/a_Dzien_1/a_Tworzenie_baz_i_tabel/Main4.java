package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main4 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public static String queryCreateTableCinemas = "CREATE TABLE cinemas\n" +
            "(\n" +
            "    id       INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    name     VARCHAR(255),\n" +
            "    addresses VARCHAR(255)\n" +
            ");";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public static String queryCreateTableMovies = "CREATE TABLE movies\n" +
            "(\n" +
            "    id          INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    title VARCHAR(255),\n" +
            "    description VARCHAR(255),\n" +
            "    rating decimal(2,0)\n" +
            ");";

       //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public static String queryCreateTableTickets = "CREATE TABLE tickets\n" +
            "(\n" +
            "    id      INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    quantity   INT,\n" +
            "    price decimal(2,0)\n" +
            ");";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego czwartą tabelę
    public static String queryCreateTablePayments = "CREATE TABLE payments (\n" +
            "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    type VARCHAR(255),\n" +
            "    payment_date DATE\n" +
            ")";
}
