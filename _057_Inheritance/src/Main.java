import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] progLanguages = new String[]{"C","Java","Python"};
        Programmer programmer = new Programmer(
                "Özkan",
                24,
                "turkey",
                "beginner",
                progLanguages);
        programmer.writecode();
        System.out.println(programmer.getName());
        System.out.println(programmer.getAge());
        System.out.println(programmer.getAddress());
        System.out.println(programmer.getExperience());
        System.out.println(Arrays.toString(programmer.getProgrammingLanguages()));





    }
}