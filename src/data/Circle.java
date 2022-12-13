package data;

public class Circle extends Shape implements Сircumference{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2)* 3.14;
    }

    @Override
    public double length() {
        return Math.pow(3.14, 2)* this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +  " " +
                "area=" + getArea() + " " +
                "length=" + length() +
                '}';
    }
}
