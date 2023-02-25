import java.math.BigDecimal;

public class Book {

    public static int count = 0 ;
    private String name;
    private int pageNumber;
    private BigDecimal price;

    public Book() {
    }

    public Book(String name, int pageNumber, BigDecimal price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.price = price;
        count++; // every time a book object is instantiated, increment the count!
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
            return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                '}';
    }

}
