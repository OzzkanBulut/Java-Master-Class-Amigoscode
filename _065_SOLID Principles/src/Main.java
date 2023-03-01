import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        Shape noShape = new NoShape(); // We violated the liskov principle.
        // Subclasses must be substitutable to the superclass!
        // noShape must not implement Shape interface!



        List<Shape> shapes = List.of(circle,square);
        double sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));

        ThreeDShape cube = new Cube(2);
        System.out.println(cube.volume());;



    }
}