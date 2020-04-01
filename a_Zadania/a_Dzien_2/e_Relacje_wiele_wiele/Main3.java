package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


public class Main3 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
    public String query1 = "create table cinemas_movies\n" +
            "(\n" +
            "    cinema_id int not null,\n" +
            "    movie_id int not null,\n" +

            "    primary key (cinema_id, movie_id),\n" +
            "    foreign key (cinema_id) references cinema (id),\n" +
            "    foreign key (movie_id) references movies (id)\n" +
            ")";
}