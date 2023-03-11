import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Working with Dates
        LocalDateTime now = LocalDateTime.now(); // both hour and date
        System.out.println(now); // prints current time
        System.out.println(now.getHour());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.minusDays(22));

        LocalTime localTime = LocalTime.now(); // only hour related stuff
        System.out.println(localTime.getHour());



    }
}