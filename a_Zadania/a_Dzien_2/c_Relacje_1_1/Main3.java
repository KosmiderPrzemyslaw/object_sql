package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main3 {
    //zapisz poniżej zapytanie tworzące tabelę - pamiętaj o relacji i dodaniu odpowiedniej kolumny
    public String queryCreateTable = "create table payments\n" +
            "(\n" +
            "    id int not null primary key,\n" +
            "    type varchar(255) null,\n" +
            "    payment_date date null,\n" +
            "    foreign key (id) references tickets (id)\n" +
            ")";
}