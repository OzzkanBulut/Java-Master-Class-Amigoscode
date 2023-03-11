import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = createFile("_036_FileMethods/example.txt");
        System.out.println("Enter the message: ");
        String message = scan.nextLine();
//        writeFile(file, message);
        readFile(file);


    }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    private static void writeFile(File file, String message) {

        try {
            FileWriter fileWriter = new FileWriter(file, true); // append makes the writing to end of the file
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(message);

            writer.flush(); // flush this contents into the file
            writer.close(); // close the file writer

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile(File file){

        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}