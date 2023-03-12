public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob",2,"Brown");
        Dog dog2 = new Dog("mike",3,"Blue");
        Dog dog3 = new Dog("mike",3,"Blue");

        System.out.println(dog1==dog1); // true
        System.out.println(dog1==dog2); // prints false, before == only compares the reference names
        System.out.println(dog1.equals(dog2)); // prints false before and after equals override
        System.out.println(dog2.equals(dog3)); // prints false before equals override, prints true after
        // NEVER COMPARE OBJECTS WITH ==
        // == checks if the objects in the heap are in the same place
        // equals checks if the objects in the heap have the same attributes




    }
}