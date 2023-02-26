package car;

import java.math.BigDecimal;

public class Car {
    private Brand brand;
    private String model;
    private BigDecimal price;

    public Car() {
    }

    public Car(Brand brand, String model, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
