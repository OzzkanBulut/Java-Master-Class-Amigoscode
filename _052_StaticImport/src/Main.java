import static java.lang.Math.*; // STATIC IMPORT
public class Main {
    public static void main(String[] args) {
        System.out.println(max(2,5));

        // Instead of typing Math.max , we static import the package.
        // we ne longer need to type Math.max
        // typing only the method name in the math class is enough

        System.out.println(sqrt(2));
        System.out.println(min(23,32));
    }
}