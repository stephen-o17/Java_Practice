package qa;
import java.lang.Math;

public class Circle extends Shape implements Movable {

    private double radius;
    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point getCentrePoint() {
        return new Point(getX(), getY());
    }

    public Point getCurrentLocation() {
        return getCentrePoint();
    }
    public void move(double x, double y) {
        setX(getX() + x);
        setY(getY() + y);
    }
}
