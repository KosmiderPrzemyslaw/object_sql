package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main2 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public static String queryCreateTableProducts =
            "CREATE TABLE products (\n" +
                    "    id INT AUTO_INCREMENT PRIMARY KEY ,\n" +
                    "    name VARCHAR(255),\n" +
                    "    description VARCHAR(255),\n" +
                    "    price DECIMAL(5,2)\n" +
                    ")";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public static String queryCreateTableOrders = "CREATE TABLE oreders \n" +
            "(\n" +
            "id INT AUTO INCREMENT PRIMARY KEY, \n" +
            "description VARCHAR(255)\n" +
            ")";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public static String queryCreateTableClients = "CREATE TABLE clients \n" +
            "(\n "+
            "id INT AUTO INCREMENT PRIMARY KEY, \n" +
            "name VARCHAR(255) \n" +
            "surname VARCHAR(255) \n " +
        ")";

}
