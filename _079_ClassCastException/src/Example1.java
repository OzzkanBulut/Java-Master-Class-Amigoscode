import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
//        numbers.add("2");

        for( Object number : numbers){
            System.out.println((String)number); // Throws ClassCastException
        }
        // List type prevents errors like that
    }
}
