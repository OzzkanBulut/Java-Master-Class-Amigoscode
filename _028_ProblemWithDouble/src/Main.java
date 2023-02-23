public class Main {
    public static void main(String[] args) {
        double num1 = 0.3;
        double num2 = 0.2;
        double result = num1 - num2 ;
        System.out.println(result);

        /* As you see, when substracting doubles , there is a precision loss.
          Because of that, there will be a problem when dealing with money.
          Do not use double for money!
          USE BIG DECIMAL
         */
    }
}