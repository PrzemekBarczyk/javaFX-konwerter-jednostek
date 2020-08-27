# konwerter-jednostek
Prosta aplikacja symulująca konwerter jednostek

### Opis projektu:
Aplikacja służy do przeliczania podanej wartości jednostki na jej równowartości w innych jednostkach.

### Cechy projektu:

* Wykorzystane wzorce architektoniczne: **MVC**
* Wykorzystane wzorce projektowe: **brak**
* Rodzaj hierarchii pakietów: **zgrupowana funkcyjnie**

### Więcej szczegółów:

Tworzenie nowego menu polega na stworzeniu nowego obiektu klasy odpowiadającego mu *Kontrolera* np. dla *MainMenu* tworzymy obiekt klasy *MainMenuController*. W argumentach konstruktora *Kontrolera* tworzone są również obiekty *Widoku* i *Modelu*. W przyszłości spróbuję zrezygnować z konieczności tworzenia obiektów tych klas w ten sposób na rzecz ich automatycznego tworzenia wewnątrz konstruktora *Kontrolera*.

Zastosowana hierarchia pakietów jest skoncentrowaną funkcyjnie. Dzięki temu że *Widok* i *Model* są w tym samym pakiecie co *Kontroller* możliwe będzie uczynienie z nich klas z modyfikatorem dostępu 'package'. Pozwoli to na większą hermetyzację danych przez zapewnienie że klasy te nie zostaną wykorzystane przez żadną inną niepowołaną klasę.
