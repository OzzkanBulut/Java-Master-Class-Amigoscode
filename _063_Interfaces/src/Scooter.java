import java.math.BigDecimal;

public class Scooter extends Vehicle {

    private String scooterSomething;

    public Scooter(String name, String color, BigDecimal price,String scooterSomething) {
        super(name, color, price);
        this.scooterSomething = scooterSomething;
    }

    public String getScooterSomething() {
        return scooterSomething;
    }

    public void setScooterSomething(String scooterSomething) {
        this.scooterSomething = scooterSomething;
    }

    @Override
    public void move() {
        System.out.println("Scooter is moving");
    }

    @Override
    public void breake() {
        System.out.println("Scooter is stopped");
    }

    @Override
    public void showPrice() {
        System.out.println("Price of Scooter is :"+getPrice());
    }
}
