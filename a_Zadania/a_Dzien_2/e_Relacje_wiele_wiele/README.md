<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Relacje wiele do wielu – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ```java``` przygotowanych do każdego zadania.

**Część zadań ma w poleceniu utworzenie relacji między tabelami, w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele.**

### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

Praca na bazie `products_ex`.  

W pliku `Main1.java`:
1. połącz tabele ```products``` i ```orders``` relacją wiele do wielu,  
2. nową tabelę nazwij `products_orders`,  
3. napisz cztery zapytania, które połączą istniejące już produkty z zamówieniami,

4. napisz w metodzie `main` program, który wyświetli:
* wszystkie zamówienia,
* wszystkie produkty należące do zamówienia (pod odpowiednim zamówieniem), np.:
```
Zamówienie o id 6:
* Produkt o id 1
* Produkt o id 3
* Produkt o id 7
```

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 2

Praca na bazie `products_ex`.  
W pliku `Main2.java` napisz program, który wyświetli:  

1. wszystkie produkty,
2. zamówienia, w których ten produkt się pojawił (pod odpowiednim produktem), np.:
```
Produkt o id 12:
* Zamówienie o id 5
* Zamówienie o id 6
* Zamówienie o id 11
```

---

#### Zadanie 3

Praca na bazie `cinemas_ex`.  
W pliku `Main3.java`:

1. połącz tabele `cinemas` i `movies` poprzez relację wiele do wielu (film może być wyświetlany w wielu kinach, kino może mieć wiele filmów) – utworzoną tabelę nazwij `cinemas_movies` (tabela będzie reprezentowała repertuar w danym kinie),
2. uzupełnij tabelę kilkoma wpisami.


#### Zadanie 4

Praca na bazie `cinemas_ex`.
W pliku `Main4.java`:

1. napisz program wyświetlający wszystkie kina, w których wyświetlany jest dany film.
```
Film o id 12:
* Kino o id 5
* Kino o id 6
* Kino o id 11
```  

#### Zadanie 5

Praca na bazie `cinemas_ex`.
W pliku `Main5.java`:

1. Napisz program, który wyświetli wszystkie filmy, wyświetlane w danym kinie.
```
Kino o id 12:
* Film o id 5
* Film o id 6
* Film o id 11
```


