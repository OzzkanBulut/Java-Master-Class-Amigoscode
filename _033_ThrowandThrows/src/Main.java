public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(divide(20,0));

    }

    public void mehmet() throws Exception {
        ahmet();
    }

    public void ahmet() throws Exception {
        ozkan();
    }

    public static void ozkan() throws Exception{ // Every time we say the method throws exception, we just hope somebody else to deal with it!
        divide(3,5);
    }
    public static double divide(int a, int b) throws Exception { // Tell people this method throws exception
        if(b==0){
            throw new ArithmeticException("Can not divide by 0");
        }
        return a/b;
    }
}