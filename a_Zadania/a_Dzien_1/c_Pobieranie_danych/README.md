<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Pobieranie danych – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików **java**, przygotowanych do każdego zadania.

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

W pliku `Main1.java`:

1. napisz program, który wyświetli na konsoli wszystkie produkty znajdujące się w bazie danych o nazwie ```products_ex```,
2. jeśli opis produktu jest dłuższy niż 20 znaków, program ma pokazywać pierwsze 20 znaków i na końcu dodawać znak: `...`,
3. dodaj do Twojej bazy produkt z długim opisem, aby przetestować działanie.

#### Zadanie 2

W pliku `Main2.java` napisz program, który wyświetli na konsoli listę filmów – ma ona zawierać filmy, których `rating` jest większy, niż średni rating wszystkich filmów.  
  
Oblicz najpierw średni rating filmów, a następnie pobierz filmy z ratingiem większym niż średni.
Wykładowca pokaże, jak można obliczyć średni rating przy pomocy zapytania SQL i funkcji `AVG()`.

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 3

W pliku `Main3.java` napisz zapytania SQL (dla bazy danych ```cinemas_ex```), które:

1. wybiorą wszystkie filmy na literę **W**,  
2. wybiorą wszystkie bilety, których cena jest większa niż **15.30**,  
3. wybiorą wszystkie bilety, których liczba jest większa niż **3**,  
4. wybiorą wszystkie filmy, które mają `rating` większy niż **6.5**.  
5. wybierz film z największą wartością `rating` (wykorzystaj `ORDER BY` oraz `LIMIT`)
6. wywołaj zapytania w metodzie `main`, a następnie wyświetl ich wyniki.


#### Zadanie 4

W pliku `Main4.java` napisz zapytania SQL (dla bazy danych `cinemas_ex`). Zapytania mają zwracać następujące wyniki:  

1. liczbę wszystkich biletów,
2. liczbę wszystkich płatności, grupując je po kolumnie `type`,
3. średnią cenę biletu,
4. pięć ostatnich płatności, zaczynając od drugiej,
5. listę wszystkich płatności (pogrupowanych po kolumnie `type`), których liczba będzie większa niż 2,
6. sumę ilości `SUM(quantity)` wszystkich biletów, których cena jest większa niż 23,15.
