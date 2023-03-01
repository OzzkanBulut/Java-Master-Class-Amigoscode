import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(2);
        Square square = new Square(3);
        ShapesPrinter shapesPrinter = new ShapesPrinter();

        List<Object> shapes = List.of(circle,square);
        double sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));

    }
}