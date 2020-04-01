<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Relacje jeden do wielu – zadania

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików **java**, przygotowanych do każdego zadania.

**Część zadań ma w poleceniu utworzenie relacji między tabelami, w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele.**


### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

W pliku `Main1.java`:

W bazie danych o nazwie ```products_ex``` stwórz następującą tabelę:
```SQL
* opinions:
  * description: string
```

1. Tabela ```opinions``` ma być połączona z tabelą ```products``` relacją jeden do wielu (produkt ma wiele opinii, opinia jest przypisana do jednego produktu).
2. Napisz po `5` zapytań, które dodadzą opinie do `3` istniejących produktów.  

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 2

W pliku `Main2.java` zapisz do przygotowanych zmiennych odpowiednie zapytania.

W bazie danych o nazwie ```products_ex``` stwórz następujące tabele:
```SQL
* categories:
  * id: int
  * name: string
* categories_sub:
  * id: int
  * main_id: int -- relacja z id głównej kategorii
  * name: string
```
Połącz tabele `categories` i `categories_sub` za pomocą relacji wiele do jednego (jedna kategoria może mieć wiele podkategorii, jedna podkategoria ma jedną kategorię nadrzędną).

#### Zadanie 3

W pliku `Main3.java` dodaj zapytania, a następnie wypisz w konsoli:

1. wszystkie produkty, które mają opinie oraz wszystkie dostępne dla nich opinie (nie powinny występować wartości null),
2. pobierz wszystkie produkty razem z opiniami, niezależnie od tego czy mają opinie (mogą występować wartości null),
3. pobierz wszystkie opinie dla produktu o **id** 1, wynik ma zawierać również wszystkie dane dotyczące produktu.

#### Zadanie 4

W pliku `Main4.java` dodaj zapytania, a następnie wypisz w konsoli:

1. wszystkie podkategorie kategorii o **id** 1, pobrane za pomocą odpowiedniego złączenia,
2. **id** oraz nazwę kategorii, ale tylko tych kategorii, które mają podkategorie (skorzystaj z `DISTINCT`).

