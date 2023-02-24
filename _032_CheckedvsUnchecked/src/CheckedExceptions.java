import java.io.File;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        // Checked Exceptions:
        // Checked exceptions must be dealt with before we even compile the actual code.
        File file = new File("foo.txt");
        if(!file.exists()){
            try {
                file.createNewFile(); // Gives an unhandled exception error!
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //  We must deal with this exception in order to run the program!
        }
        // ANY EXCEPTION CLASSES THAT ARE NOT A SUBCLASS OF RUNTIMEEXCEPTION, ARE CHECKED EXCEPTIONS!
    }
}
