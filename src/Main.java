import contoller.Controller;
import data.Circle;
import data.Rectangle;
import data.Square;
import data.Triangle;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller() ;
        controller.addShape(new Circle(2.0));
        controller.addShape(new Circle(5.0));
        controller.addShape(new Triangle(5.3, 3.6, 7.8));
        controller.addShape(new Rectangle(7.5, 10.0));
        controller.addShape(new Square(7.5));
        controller.showAllShapes();
        controller.getAllAreas();
        controller.getAllPerimeters();
    }
}