<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Relacje jeden do jednego – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ``java`` przygotowanych do każdego zadania.

**Część zadań ma w poleceniu utworzenie relacji między tabelami, w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele**

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

W pliku `Main1.java`:
W bazie danych o nazwie ```products_ex``` stwórz następującą tabelę:
```SQL
* client_address:
  * client_id: int
  * city: string
  * street: string
  * house_nr: string
```

Tabela ```client_address``` ma być połączona relacją jeden do jednego z tabelą ```clients```.  
Napisz 5 zapytań SQL, które wprowadzą adresy dla istniejących już użytkowników.

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 2 – import bazy danych

Jeżeli nie masz bazy danych `cinemas_ex` albo jest ona niekompletna, to usuń ją i stwórz nową bazę danych o nazwie ```cinemas_ex```.  
Następnie zaimportuj do niej dane z pliku **cinema.sql**. Są to tabele wypełnione dużą ilością danych – takie jak wczoraj, brakuje tylko tabeli płatności.

#### Zadanie 3
W pliku `Main3.java`:
Praca na bazie `cinemas_ex`  

Stwórz tabelę do płatności.  
Ma mieć takie same dane, jak w zadaniach z poprzedniego dnia.  
```SQL
 * payments:
   * id: int
   * type: string
   * payment_date: date
 ```

Dodatkowo tabela `payments` z tabelą `tickets` ma być powiązana relacją jeden do jednego.  
Relacja między biletem a płatnością jest następująca:  
* bilet ma dwa stany: opłacony i nieopłacony – oznaczamy je wartościami: `1` (opłacony) lub `0` (nieopłacony)
* płatność musi być przypisana do biletu **(dodaj klucz obcy do tabeli `payments` podczas jej tworzenia)**

Uzupełnij tabelę `payments` kilkoma wpisami. Przyjmujemy trzy typy płatności: `cash`, `transfer` i `card`.

#### Zadanie 4
W pliku `Main4.java`:
Dodaj zapytania do pliku a następnie wypisz w konsoli:

1. Wszystkie bilety które zostały opłacone gotówką (czyli `type` = `cash` ).
2. Wszystkie bilety które zostały opłacone przelewem (czyli `type` = `transfer` ).
3. Wszystkie bilety które zostały opłacone kartą (czyli `type` = `card` ).
4. Wszystkie bilety które nie zostały jeszcze opłacone.
