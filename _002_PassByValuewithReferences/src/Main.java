public class Main {
    public static void main(String[] args) {
        // Pass by Value with Objects
        Point pointA = new Point(10,20);
        Point pointB = pointA;
        pointA.setX(25);
        pointB.setY(50);
        System.out.println(pointA); // this will also change
        System.out.println(pointB); // Both points will be identical, because they both refer to the same object
        System.out.println("Both points are the same, because they both refer to the same object!");
        System.out.println("Java is always a passed by value for both reference types as well as primitives!".toUpperCase());

        System.out.println();
        pointB = new Point(25,50); // We created a new object in heap, reference of point B will now change
        pointB.setY(60);

        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println("Now they are different, because they refer to the different objects");

    }
}