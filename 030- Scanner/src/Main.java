import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello whats your name");
        String input = scan.nextLine();

        System.out.println("Hello " + input);

        System.out.println("Age?");
        int age = scan.nextInt();
        System.out.println(age);

    }
}