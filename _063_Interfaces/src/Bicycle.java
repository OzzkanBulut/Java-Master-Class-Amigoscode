import java.math.BigDecimal;

public class Bicycle extends Vehicle implements VehicleInterface{

    private String bicycleSomething;

    public Bicycle(String name, String color, BigDecimal price, String bicycleSomething) {
        super(name, color, price);
        this.bicycleSomething = bicycleSomething;
    }

    public String getBicycleSomething() {
        return bicycleSomething;
    }

    public void setBicycleSomething(String bicycleSomething) {
        this.bicycleSomething = bicycleSomething;
    }


    @Override
    public void move() {
        System.out.println("Bicycle is moving");

    }

    @Override
    public void breake() {
        System.out.println("Bicycle is stoping");

    }

    @Override
    public void showPrice() {

        System.out.println("Price  of bicycle is " + getPrice());
    }
}
