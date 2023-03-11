import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



        File file = new File("_037_TryWithResources/exx.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        writeFile(file,true);

    }

    private static void writeFile(File file, boolean append){
        try(
                FileWriter fileWriter = new FileWriter(file,append);
                PrintWriter writer = new PrintWriter(fileWriter);
                ){
            System.out.println("What to write?");
            String input = scan.nextLine();
            writer.println(input);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}