<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Zmiana i usuwanie danych – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ``java`` przygotowanych do każdego zadania.

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

Praca na bazie `cinemas_ex`.

W pliku `Main1.java`:  

1. pobierz z bazy `id` i `tytuł` filmu, a następnie wyświetl na konsoli listę filmów,
2. pobierz od użytkownika identyfikator filmu z konsoli,
3. usuń wiersz na podstawie pobranego identyfikatora.

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 2

Praca na bazie `cinemas_ex`.  

W pliku `Main2.java`:  

1. pobierz z bazy listę biletów i wyświetl na konsoli,
2. pobierz od użytkownika identyfikator biletu z konsoli,
3. pobierz z konsoli liczbę sprzedanych biletów,
4. zmodyfikuj odpowiedni wiersz w bazie danych.

#### Zadanie 3

Praca na bazie `cinemas_ex`.  

W pliku `Main3.java` napisz zapytania SQL, które:  

1. usuną wiersz z tabeli filmów o `id` = 4,
2. usuną wiersze z tabeli o nazwie `helios`,
3. ustawią dla wszystkich biletów ilość na 10,
4. usuną wszystkie płatności, których data jest wcześniejsza niż 2017-01-01.

#### Zadanie 4

Praca na bazie `cinemas_ex`.  

W pliku `Main4.java` napisz następujące zapytania do bazy:

1. zmieniające adres na `Stadion Narodowy` dla kin, których nazwa kończy się na `Z`, 
2. usuwające płatności, których data jest starsza niż `4` dni od aktualnego czasu (z dokładnością do sekundy),
3. zmieniające rating filmu na `5.4` dla filmów, których opis jest dłuższy niż `40` znaków – poszukaj funkcji `MySQL`, która sprawdza liczbę znaków,
4. zmniejszające cenę biletu o `50%`, jeśli ich liczba jest większa niż `10`, zapisz je jako pojedyncze zapytanie `SQL`.

#### Zadanie 5

Praca na bazie `cinemas_ex`.  

W pliku `Main5.java`:  

1. pobierz z bazy wszystkie kina.
2. dla każdego pobranego wiersza, wyświetl `id`, `nazwę` i `adres` kina na konsoli.
3. pobierz z konsoli od użytkownika informację czy chce dokonać edycji lub usunięcia (ma wpisać **e** jeżeli edycja, **u** jeżeli usunięcie, **x** jeżeli wyjście z programu).  
Odpytanie powinno odbywać się w pętli,
4. jeżeli wybrał **e** lub **u**, odpytujemy o `id` wiersza do edycji/usunięcia,
5. w przypadku edycji, pobieramy nową nazwę oraz adres i modyfikujemy dane. Wyświetlamy wszystkie wiersze ponownie,
6. w przypadku usunięcia, prosimy o potwierdzenie przez wpisanie `T` lub `N`, po wybraniu `T`, usuwamy wiersz i wyświetlamy wszystkie wiersze ponownie.
