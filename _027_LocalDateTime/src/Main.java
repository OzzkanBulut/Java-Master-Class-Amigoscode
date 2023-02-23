import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Working with Dates
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // prints current time
        System.out.println(now.getHour());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.minusDays(22));
    }
}