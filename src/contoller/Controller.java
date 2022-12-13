package contoller;

import data.Shape;
import service.FigureRepository;
import view.Console;

public class Controller {
    private final Console console ;
    private final FigureRepository repository;
    public Controller() {
        this.repository = new FigureRepository();
        this.console = new Console();

    }

    public void showAllShapes(){
        console.showAllShapes(this.repository.getShapeList());
        console.showTotalArea(this.repository.allAreas());

    }

    public void addShape(Shape shape) {
        this.repository.add(shape);

    }

    public void getAllAreas(){
        this.repository.allAreas();
    }

    public void getAllPerimeters(){
        console.showTotalPerimeter(this.repository.allPerimeters());
    }

}
