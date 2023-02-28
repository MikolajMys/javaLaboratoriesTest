/*Zadanie 1.
Zdefiniuj klasę Point posiadającą dwa publiczne, ostateczne pola x, y.
Napisz konstruktor ustawiający te wartości.

Zdefiniuj klasę Segment reprezentującą odcinek, posiadającą dwa prywatne punkty klasy Point.
Wygeneruj akcesory i mutatory klasy Segment. Napisz publiczną metodę, która zwraca długość odcinka.
W kolejnym kroku usuń mutatory i utwórz konstruktor ustawiający
te pola na wartości swoich dwóch parametrów.*/
public class Main {
    public static void main(String[] args) {
        Point p1=new Point(3, 0);
        Point p2=new Point(3, 3);
        Segment segment=new Segment(p1, p2);
        double distance=segment.getDistance();

        System.out.println(distance);
    }
}