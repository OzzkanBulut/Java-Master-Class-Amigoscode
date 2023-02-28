public interface VehicleInterface {
    //Constants
    public static double PURCHASE_RATE = 0.5; //Now this is a constant.It's basically a variable,,
    // static is redundant for interface fields

    void move();
    void breake();
    void showPrice();

    //Default method
    default void defaultMethod(){ // default method is a method that is already in the interface!Subclasses do not need
        // to implement the dafult method
        System.out.println("This is the default method!");
    };
}
