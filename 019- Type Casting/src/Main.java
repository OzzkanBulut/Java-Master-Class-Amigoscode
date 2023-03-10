public class Main {
    public static void main(String[] args) {
        // Type Casting - Convert one data type to another
        // Implicit Type (Widening) Casting
        int balance = 100;
        System.out.println((double)balance);

        // Explicit Type(Narrowing) Casting
        double height = 102.5;
        System.out.println((int)height); // height will lose the fraction value


    }
}