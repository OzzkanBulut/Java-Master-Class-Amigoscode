public class Main {
    public static void main(String[] args) {
        String name1 = "Özkan";
        String name2 = "Özkan";
//        name2 = "Alex";
        String name3 = new String("Özkan");
        System.out.println("String equality with ==");
        System.out.println(name1==name2); // ARE THE REFERENCES POINT TO THE SAME OBJECT?
        System.out.println(name1==name3);
        System.out.println("String equality with equals");
        System.out.println(name1.equals(name2)); // ARE THE VALUES OF THE OBJECTS THAT REFERENCES POINT SAME?
        System.out.println(name1.equals(name3));

        // == compares the references
        // equals compares the object values!
        // IF YOU WANT TO COMPARE STRINGS, NEVER USE ==. USE EQUALS!

    }
}