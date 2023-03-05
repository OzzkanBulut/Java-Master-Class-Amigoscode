import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("MyPhone",1111,"NicePhoneModel");
        Laptop laptop = new Laptop("MyLaptop",123);
        Television tv = new Television("MyTv",1456,"NiceTVModel");
        List<TechStuff> stuffList = Arrays.asList(phone,laptop,tv);

        Box<TechStuff> techBox = new Box<>(stuffList);

        System.out.println(techBox);
    }
}