import java.math.BigDecimal;

public class Car extends Vehicle implements VehicleInterface {
    private boolean doesHaveInsurance;

    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public void breake() {
        System.out.println("Car is stopped");

    }

    @Override
    public void showPrice() {
        System.out.println("Price  of car is " + getPrice());

    }

    public Car(String name, String color, BigDecimal price, boolean doesHaveInsurance) {
        super(name, color, price);
        this.doesHaveInsurance = doesHaveInsurance;
    }

}
