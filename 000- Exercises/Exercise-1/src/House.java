import java.math.BigDecimal;

public class House {
    private String meters;
    private BigDecimal price;
    private int rooms;

    public House() {
    }

    public House(String meters, BigDecimal price, int rooms) {
        this.meters = meters;
        this.price = price;
        this.rooms = rooms;
    }

    public String getMeters() {
        return meters;
    }

    public void setMeters(String meters) {
        this.meters = meters;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "meters='" + meters + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                '}';
    }
}
