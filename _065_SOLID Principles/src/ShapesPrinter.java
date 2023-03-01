import java.util.List;

public class ShapesPrinter {
    public String json(double sum){
        return "{shapesSum : %s}".formatted(sum);
  }

    public String csv(double sum){
        return "shapes_Sum,%s}".formatted(sum);
    }
}
