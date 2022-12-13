package data;

public class Rectangle extends Polygon {

    double width;
    double height;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + perimeter() +
                '}';
    }
}

