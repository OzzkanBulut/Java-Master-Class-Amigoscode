public class Main {
    public static void main(String[] args) {
        String name1 = "Özkan";
        String name2 = "Ali";
        name2 = "Mehmet";

        String name3 = new String("Özkan"); // This is different from name1 and name2
        // In name3, the string is not in the string pool, It is an object of it's own in the heap!

        String inPool = "In the String Pool";
        String notInPool = new String("Not in the String Pool!");
        /*
        If you create strings outside of the string pool, YOU CAN NOT REUSE THEM.
        EACH TIME YOU MAKE A NEW REFERENCE TO THE SAME STRING, IT CREATES ANOTHER OBJECT.
        YOU HAVE NO CONTROL! DON'T DO THIS!
         */

        String dup1 = new String("String");
        String dup2 = new String("String");
        String dup3 = new String("String"); //HERE, THERE ARE 3 STRING OBJECTS IN THE HEAP WITH THE SAME VALUE!




    }
}