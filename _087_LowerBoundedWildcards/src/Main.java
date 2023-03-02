import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        List<Number> eee = Arrays.asList(1, 2, 3, 4);

        printThem(numbers); // works! because its integer
        System.out.println();
//        printThem(doubles); doesnt work! because Double is not a superclass of Integer
        printThem(eee); // works! Because its a superclass of integer

    }

    static void printThem(List<? super Integer> list) { // Take Lists type of Integer or superclass of Integer
        list.forEach(System.out::println);
    }
}