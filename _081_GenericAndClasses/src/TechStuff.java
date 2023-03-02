public class TechStuff {
    private final int price;

    public TechStuff(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TechStuff{" +
                "price=" + price +
                '}';
    }
}
