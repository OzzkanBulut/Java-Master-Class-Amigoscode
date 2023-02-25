import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Static means that either the property or the class that it's attached to is belongs to the class
        // itself rather than the instance.
        Book gameOfThrones = new Book("Game of Thrones",400,new BigDecimal(300));
        System.out.println(Book.count);
        // Static count attribute does not belong to the gameOfThrones instance
        // It belongs to the Book class itself!
//        gameOfThrones.count --> Does not exist. Because count belongs to the Book Class


    }
}