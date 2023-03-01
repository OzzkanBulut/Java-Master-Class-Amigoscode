import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        Shape noShape = new NoShape(); // We violated the liskov principle.
        // Subclasses must be substitutable to the superclass!
        // noShape must not implement Shape interface!



        List<Shape> shapes = List.of(circle,square,noShape);
        double sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));



    }
}