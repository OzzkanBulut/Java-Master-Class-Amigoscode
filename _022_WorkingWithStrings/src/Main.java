public class Main {
    public static void main(String[] args) {
        // Strings
        String firstName = "Özkan";
        String lastName = " Bulut";
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.toLowerCase());
        System.out.println(" ".isBlank()); // true, there are spaces in the string
        System.out.println(" ".isEmpty()); // false, there are spaces in the string
        System.out.println(" Hello ".trim());
        System.out.println(firstName.startsWith("Ö")); // true
        System.out.println(firstName.substring(0,3)); // özk
        System.out.println(firstName.replace('Ö','A')); // Replace Ö with A
        System.out.println(firstName.charAt(2)); // k
        System.out.println(firstName.contains("a")); // true

        System.out.println(firstName.concat(lastName)); // unite the strings
        System.out.println(firstName+ " Bulut");

    }
}