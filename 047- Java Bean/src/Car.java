import java.io.Serializable;
import java.math.BigDecimal;

public class Car implements Serializable {
    // Classes that implements serializable interface can be written to streams.(file,database etc.)
    private String regNumber;
    private BigDecimal price;

    public Car() {
    }

    public Car(String regNumber, BigDecimal price) {
        this.regNumber = regNumber;
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
