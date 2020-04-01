<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Tworzenie bazy danych i tabel – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ``java``, przygotowanych do każdego zadania.  
Zadania z wykładowcą i zadania samodzielne będą wykonywane na **dwóch różnych** bazach danych.

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

W pliku `Main1.java`:

1. w zmiennej `query` zapisz zapytanie tworzące nową bazę danych o nazwie ```products_ex```;
2. w metodzie `main` napisz kod, który stworzy połączenie do tej bazy danych.


#### Zadanie 2

W pliku `Main2.java`:

W bazie danych o nazwie ```products_ex``` stwórz następujące tabele:
```SQL
* products:
  * id: int
  * name: String
  * description: String
  * price: decimal (2 decimal places)

* orders:
  * id:int
  * description: String

* clients:
  * id: int
  * name: String
  * surname: String
```

Zapytania SQL zapisz w przygotowanym pliku.
**Pamiętaj aby użyć odpowiednich typów danych dla każdej kolumny w bazie.**

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 3

W pliku `Main3.java`:

1. stwórz nową bazę danych o nazwie ```cinemas_ex```. Pamiętaj, że tworzenie się nie uda, jeżeli baza już istnieje;  
2. napisz kod w metodzie `main`, który stworzy połączenie do tej bazy danych.

#### Zadanie 4

W pliku `Main4.java`:

w bazie danych o nazwie ```cinemas_ex``` stwórz następujące tabele (jeżeli tabela już istnieje, to nie da się jej stworzyć – SQL zwróci błąd):
```SQL
* cinemas:
  * id: int
  * name: String
  * address: String

* movies:
  * id: int
  * title: String
  * description: String
  * rating: decimal (2 decimal places)

* tickets:
  * id: int
  * quantity: int
  * price: decimal (2 decimal places)

* payments:
  * id: int
  * type: String (Zakładamy, że są trzy typy płatności: `cash`, `transfer` lub `card`).
  * payment_date: date
```

Zapytania SQL zapisz w przygotowanym pliku.  
Pamiętaj o:  
1. zakładaniu odpowiednich atrybutów na pola (np. każde **id** powinno być kluczem głównym, automatycznie numerowanym),  
2. używaniu **odpowiednich typów danych** dla każdej kolumny w bazie,
3. dokładnym czytaniu **kodów błędów** zwracanych przez MySQL.  
