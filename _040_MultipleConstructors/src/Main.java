public class Main {
    public static void main(String[] args) {
        Cat mars = new Cat("mars");
        Cat jupiter = new Cat("jupiter",3);
        Cat empty = new Cat();

        System.out.println("Cat constructor with all parameters: ");
        System.out.println(jupiter.getName()+" "+jupiter.getAge());
        System.out.println();
        System.out.println("Cat constructor with just name parameter:");
        System.out.println(mars.getName()+" "+mars.getAge());
        System.out.println();
        System.out.println("Cat constructor with no parameters: ");
        System.out.println(empty.getName()+" "+empty.getAge()); // null integer is 0 by default

    }
}