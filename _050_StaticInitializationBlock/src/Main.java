public class Main {
    static{
        System.out.println("Static initializtion in main");
    }
    public static void main(String[] args) {
//        System.out.println(Person.count); // Static initialization begins when we create a person instance
        // Even though we did not create an instance, the static initialization still works!

        new Person(); // now the constructor in public class works!




    }
}