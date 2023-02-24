public class Phone {
    private String brand;
    private int price;
    private int version;

    public Phone() {
    }

    public Phone(String brand, int version) {
        this.brand = brand;
        this.version = version;
    }

    public Phone(String brand, int price, int version) {
        this(brand,version); // constructor inside another constructor
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", version=" + version +
                '}';
    }
}
