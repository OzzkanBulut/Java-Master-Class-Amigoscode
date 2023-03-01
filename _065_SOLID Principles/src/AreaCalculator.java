import java.util.List;

public class AreaCalculator {

    public double sum (List<Object> shapes){
        double sum = 0 ;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if(shape instanceof Square){
                sum = sum + Math.pow(((Square)shape).getLength(),2);
            }else if(shape instanceof Circle){
                sum = sum + (Math.PI * Math.pow(((Circle)shape).getRadius(),2));
            }
        }
        return sum;
    }
}
