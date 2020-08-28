# konwerter-jednostek
Prosta aplikacja symulująca konwerter jednostek

### Opis projektu:
Aplikacja służy do przeliczania podanej wartości jednostki na jej równowartości w innych jednostkach.

### Cechy projektu:

* Wykorzystane wzorce architektoniczne: **MVC**
* Wykorzystane wzorce projektowe: **brak**
* Rodzaj hierarchii pakietów: **zgrupowana funkcyjnie**

### Więcej szczegółów:

Tworzenie nowego menu polega na stworzeniu nowego obiektu klasy odpowiadającego mu *Kontrolera* np. dla *MainMenu* tworzymy obiekt klasy *MainMenuController*. *Widok* i *Model* są tworzone wewnątrz jego konstruktora.

Zastosowana hierarchia pakietów jest skoncentrowaną funkcyjnie. Dzięki temu że *Widok* i *Model* są w tym samym pakiecie co *Kontroller* posiadają modyfikator dostępu 'default'. Pozwala to na większą hermetyzację danych przez zapewnienie że klasy te nie zostaną wykorzystane przez żadną inną niepowołaną klasę spoza pakietu.
