public class UncheckedException {
    public static void main(String[] args) {
        // Unchecked Exception


        for(int i = 10 ; i>=0;i-- ){
            System.out.println(10/i);;
        }
        // The division will give an exception.
        // This is a runtime Exception, which is an unchecked exception
        // Unchecked expressions do not need to be declared in a method or constructor's throw clause
        // Because the app itself throws the exception
    }
}
