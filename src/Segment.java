public class Segment {
    private Point a;
    private Point b;

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
    public double getDistance() {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
