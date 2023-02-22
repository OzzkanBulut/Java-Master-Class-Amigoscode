public class Main {
    static String foo = "foo";
    String brand = "Amigoscode";

    //Anything that has the static keyword in it , IT BELONGS TO THE CLASS ITSELF, NOT THE INSTANCE!
    public static void main(String[] args) {
        System.out.println(foo);
        // System.out.println(brand); --> Will not work, because a non static field can not be referenced from a static context

        // foo(); --> Also will not work, because a non static method can not be called from a static context

    }
    public void foo() {}
}