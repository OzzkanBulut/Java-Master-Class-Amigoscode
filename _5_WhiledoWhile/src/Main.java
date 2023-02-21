public class Main {
    public static void main(String[] args) {
        int i = 0;
        boolean keepLooking = true;
        while (keepLooking) {
            System.out.println("hello " + ++i);
            keepLooking = false;
        }
        keepLooking = true;
        do {
            System.out.println("hello " + i++);
            keepLooking = false;
        } while (keepLooking);
    }
}