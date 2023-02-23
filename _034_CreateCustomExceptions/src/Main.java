import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        file();

    }
    public static int divide(int a, int b){
        if(b==0){
            throw new MyUncheckedException("Cannot divide by 0");
        }
        return a/b;
    }

    public static void file() {
        File file = new File("src");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}