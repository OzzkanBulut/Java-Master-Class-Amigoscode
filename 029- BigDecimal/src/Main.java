import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("0.3");
        BigDecimal number2 = new BigDecimal("0.2");
        BigDecimal result = number1.subtract(number2);

        System.out.println(result); // No problem

        BigDecimal ten = BigDecimal.TEN;
        System.out.println(ten.add(BigDecimal.valueOf(2)));
        System.out.println(ten.max(BigDecimal.valueOf(23)));
        System.out.println(ten.compareTo(BigDecimal.valueOf(11))); // -1 smaller 0 equal 1 bigger

    }
}