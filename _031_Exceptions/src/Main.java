public class Main {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("1x"); // throws exception and does not carry on the code!
            for(int i = 10;i>=0;i--){
                System.out.println(10/i);
            }
        }catch(NumberFormatException  | ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace(); // execution flow of the program up to the blow-up point
        }catch(Exception e ){ // Used only when you dont know the exception type!
            // Catch all exception
        }
        finally {
            System.out.println("Finally always run");
        }

    }
}