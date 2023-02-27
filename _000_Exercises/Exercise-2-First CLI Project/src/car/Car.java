package car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private int modelYear;
    private BigDecimal price;

    private CarBrand brand;

    private boolean isAvailable;

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public Car() {
    }

    public Car(int modelYear, BigDecimal price,CarBrand carBrand) {
        this.modelYear = modelYear;
        this.price = price;
        this.brand = carBrand;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelYear == car.modelYear && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelYear, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelYear=" + modelYear +
                ", price=" + price +
                '}';
    }
}
