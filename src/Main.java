
/*Przeanalizuj zmiany, jakie zostały poczynione względem programu napisanego na poprzednich zajęciach:

konstruktor klasy Polygon ustawia tablicę wierzchołków,
usunięte zostały wszystkie pola i metody związane ze stylem,
klasa abstrakcyjna Shape mogła stać się przez to interfejsem,
klasa Point została przemianowana na Vec2.*/
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static final Point test = new Point(2,3);



    public static void main(String[] args) {
        Shape poly = new Polygon(new Vec2[]{new Vec2(120,60), new Vec2(270,280), new Vec2(240,320), new Vec2(110,80)});

        SvgScene scene=new SvgScene();
        scene.addShape(poly);
        scene.saveHtml("scene.html");
    }
}
