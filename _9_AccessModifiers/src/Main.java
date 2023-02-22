public class Main {


    public static String foo = "bar"; // foo attribute can be accessible anywhere
    static String eeo = "ahia"; // because it's default, it's only accessible in the package and the class itself

    private String brand = "Amigoscode";

    public static void main(String[] args) {
        /*  Access Modifiers - Access Level
            classes, methods, attributes & constructors
            default, public, private & protected

            public -> Public means that this class can be accessible by ANY OTHER CLASS
            public static void main --> This main class can be accessed by anyone

        */
        String foo = "bar"; // This is a local variable because it's inside a method
        // public String foo = "bar"; --> This will not work inside.
        // BECAUSE ACCESS MODIFIERS ARE ONLY FOR CLASSES, METHODS, ATTRIBUTES and CONSTRUCTORS!
        System.out.println("main");

        /* When to use which Modifier?
            Public --> When you want any other user to use, give it for free
            Private -->Stuff that you dont want exposed, Used when you want reusability within the class itself so that multiple methods can reuse it
            Default --> Anything within the same package

        */
    }
}