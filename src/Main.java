/*Zadanie 1.
Zdefiniuj klasę Point posiadającą dwa publiczne, ostateczne pola x, y.
Napisz konstruktor ustawiający te wartości.

Zdefiniuj klasę Segment reprezentującą odcinek, posiadającą dwa prywatne punkty klasy Point.
Wygeneruj akcesory i mutatory klasy Segment. Napisz publiczną metodę, która zwraca długość odcinka.
W kolejnym kroku usuń mutatory i utwórz konstruktor ustawiający
te pola na wartości swoich dwóch parametrów.

Zadanie 2.
Zdefiniuj w klasie Segment publiczną metodę toSvg(),
która zwróci napis zawierający kod języka znacznikowego SVG pozwalający wyświetlić tę linię.*/

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        Segment segment = new Segment(point, new Point(2,2));
        System.out.println(segment.getSvg());
    }
}
