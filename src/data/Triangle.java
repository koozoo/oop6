package data;

public class Triangle extends Polygon {

    double a;
    double b;
    double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public double getArea() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Side a=" + a +
                ", Side b=" + b +
                ", Side c=" + c +
                ", area=" + getArea() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
