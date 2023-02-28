import java.util.Locale;
public class Segment {
    private Point a;
    private Point b;
    //" <line x1="20" y1="20" x2="80" y2="80" style="stroke:black" />"
    //    String test = String.format(Locale.ENGLISH, " %f ", 2);
    public Segment(Point a, Point b){
        this.a=a;
        this.b=b;
    }
    public Point getA() {
        return a;
    }
    public Point getB() {
        return b;
    }
    public void setA(Point a) {
        this.a = a;
    }
    public void setB(Point b) {
        this.b = b;
    }
    public String getSvg(){
        String result = String.format(Locale.ENGLISH,"<line x1=\"%.2f\" y1=\"%.2f\" x2=\"%.2f\" y2=\"%.2f\" style=\"stroke:black\" />", a.x, a.y, b.x, b.y);
        return result;
    }
    public double getDistance() {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
