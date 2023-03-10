public class Main {
    private static final String BRAND = "Amigoscode"; // You can use the brand only in this class!

    public static final String PUBLICBRAND = "AmigoscodePublic"; // You can use publicbrand everywhere!

    public static void main(String[] args) {
        String country = "Turkey"; // You can only reach this variable in the scope of main
        System.out.println(BRAND); // prints amigoscode
        String BRAND = "adidas";
        System.out.println(BRAND); // prints adiadads
        foo();

    }

    private static void foo(){
        System.out.println(BRAND); // you can use brand also here

    }
}