import java.util.List;

public class ShapesPrinter {
    private AreaCalculator areaCalculator = new AreaCalculator();
    // this is wrong. If you make a change in areacalculator then we actually are breaking the open close principle.
    // ShapesPrinter class is depend on a concrete class.This is wrong!
    //Instead, make AreaCalculator class an interface.
    private final IAreaCalculator iAreaCalculator;

    public ShapesPrinter(IAreaCalculator iAreaCalculator) {
        this.iAreaCalculator = iAreaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{shapesSum : %s}".formatted(areaCalculator.sum(shapes));
  }

    public String csv(List<Shape> shapes){
        return "shapes_Sum,%s}".formatted(areaCalculator.sum(shapes));
    }
}
