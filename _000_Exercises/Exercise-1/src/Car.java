import java.math.BigDecimal;

public class Car {
    private String brand;
    private int modelYear;
    private String color;
    private BigDecimal price;

    public Car(CarBrand tofas, int modelYear, String red, BigDecimal price) {
    }

    public Car(String brand, int modelYear, String color, BigDecimal price) {
        this.brand = brand;
        this.modelYear = modelYear;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
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
                "brand='" + brand + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
