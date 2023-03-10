import java.awt.*;

public class Main {
    public static final String NAME = "alex"; // can not reassign this

    public static void main(String[] args) {
        // Final Keyword
        // Allows you to create constants, prevent inheritance and prevent method overriding

        System.out.println(NAME);
//      name = "özkan"; --> will not work!
        final Point p = new Point(3, 5);
//        p = new Point(); --> Not work !

        p.y = 1; // You can change x and y because those variables are not final!
        p.x = 2;

        System.out.println(Math.PI); // PI is final too!


    }
}