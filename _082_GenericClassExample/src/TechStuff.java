import java.util.Objects;

public class TechStuff {
    private String name;
    private int price;

    public TechStuff(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TechStuff{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechStuff techStuff = (TechStuff) o;
        return price == techStuff.price && Objects.equals(name, techStuff.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
