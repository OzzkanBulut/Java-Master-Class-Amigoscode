public interface VehicleInterface {
    //Constants
    public static double PURCHASE_RATE = 0.5; //Now this is a constant.It's basically a variable,,
    // static is redundant for interface fields

    void move();
    void breake();
    void showPrice();
}
