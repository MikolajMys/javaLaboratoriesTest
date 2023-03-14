
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Shape poly = new Polygon(new Vec2[]{new Vec2(120,60), new Vec2(270,280), new Vec2(240,320), new Vec2(110,80)});
        Shape ellipse = new Ellipse(new Vec2(3.14, 14.3), 100, 100);
        poly = new SolidFillShapeDecorator(poly, "green");
        poly = new StrokeShapeDecorator(poly, "blue", "10");
        ellipse = new SolidFillShapeDecorator(ellipse, "red");
        SvgScene scene=new SvgScene();
        scene.addShape(poly);
        scene.addShape(ellipse);
        scene.saveHtml("scene.html");
    }
}
