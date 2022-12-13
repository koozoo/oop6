package data;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public double perimeter() {
        return side * 4;
    }


    public double getSide() {
        return side;
    }
}
