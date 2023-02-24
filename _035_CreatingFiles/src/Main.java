import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("_035_CreateFiles/a.txt");
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}