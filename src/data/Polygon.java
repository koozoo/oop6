package data;

public abstract class Polygon extends Shape implements Perimeter{

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
