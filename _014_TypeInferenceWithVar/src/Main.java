public class Main {
    private String brand = "Amigoscode"; // var keyword will not work because brand is not a local variable

    public static void main(String[] args) {

        //Type inference with var keyword

        var name = "Özkan";
        var names = new String[]{"Ali", "Mehmet", "Ali"}; // it's different in arrays
        var age = 22;
        var isAdult = false;
        var balance = 2_000_000.33;
        // var keyword was introduced in java 10. It allows automatic detection of variables being used.

        printBrand(name); // name is a String

    }

    public static void printBrand(String brand){ // you can not make brand var

    }
}