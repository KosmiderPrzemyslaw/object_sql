package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main1 {
    //zapisz poniżej zapytania dodający tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "create table client_addresses\n" +
            "(\n" +
            "    client_id    int not null primary key,\n" +
            "    city         varchar(255) null,\n" +
            "    street       varchar(255) null,\n" +
            "    house_number varchar(255) null,\n" +
            "    foreign key (client_id) references clients (id) on delete cascade\n" +
            ")";

    //zapisz poniżej kod dodania do bazy rekordów
    public String tableAddRow1 = "INSERT INTO client_addresses VALUES (1, 'Gliwice', 'Czwartakow', '25')";
    public String tableAddRow2 = "INSERT INTO client_addresses VALUES (1, 'Katowice', 'Wolnego', '4')";
    public String tableAddRow3 = "INSERT INTO client_addresses VALUES (2, 'Krakow', 'Mazowiecka', '1')";
    public String tableAddRow4 = "INSERT INTO client_addresses VALUES (2, 'Gdansk', 'Morska', '5')";
    public String tableAddRow5 = "INSERT INTO client_addresses VALUES (100, 'Gliwice', 'Czwartakow', '25')";
}
