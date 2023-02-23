public class Main {
    public static void main(String[] args) {
        String name1 = "Özkan";
        /*
        When the string created, name1 is stored in the stack, and the object(Özkan) is
        stored in the heap. There is a special memory region in heap called String pool.

        String Pool: Special memory region where strings are stored by the JVM.

        */
        String name2 = name1;
        // name2 is also Özkan , and there is already an Özkan object in the String pool.name2 reuses the object
        // It doesn't create the Özkan object again, and both name1 and name2 references the same object.
        name1 = "Ali";
        System.out.println(name1);
        System.out.println(name2);
        // STRINGS ARE IMMUTABLE!
        // WHEN YOU CHANGE THE VALUE OF A STRING, A NEW OBJECT IS CREATED AND REFERENCE IS CHANGED
        // THE OLD STRING ALWAYS STAYS THERE UNTIL GARBAGE COLLECTOR ERASES


    }
}