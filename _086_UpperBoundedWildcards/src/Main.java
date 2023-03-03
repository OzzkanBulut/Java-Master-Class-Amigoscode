import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubles = Arrays.asList(1.2, 2.3, 3.4, 4.5, 5.6);
        List<String> eeee = Arrays.asList("123", "456", "789");
        List<BigDecimal> veryBig = Arrays.asList(new BigDecimal(1), new BigDecimal(2), new BigDecimal(3));

        printList(numbers);
        System.out.println();
        printList(doubles);
//        printList(eeee); --> Does not work because String is not inherits Number Class!
        System.out.println();
        printList(veryBig);
        System.out.println();
        System.out.println(returnNumber(2));
        System.out.println(returnNumber(2.0)); // both works
    }

    static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
    }
    static <E extends Number> E returnNumber(E e){
        return e;
    }
}