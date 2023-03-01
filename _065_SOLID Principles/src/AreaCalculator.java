import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public double sum(List<Shape> shapes){
        double sum = 0 ;
        for (int i = 0; i < shapes.size(); i++) {
            sum = sum + shapes.get(i).area();
        }
        return sum;
    }

//    public String json(List<Object> shapes){
//        return "{sum : %s}".formatted(sum(shapes));  --> This code block is against the purpose of Single responsibility
//    } // this method must be a separate class!
}
