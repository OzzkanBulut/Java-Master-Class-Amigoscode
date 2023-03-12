import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose",2,"Blue");
        Cat mike = new Cat("Mike",3,"Green");
        Cat john = new Cat("John",5,"Brown");

        List<Cat> catsAlex = new ArrayList<>();
        catsAlex.add(rose);
        catsAlex.add(mike);
        catsAlex.add(john);

        Person alex = new Person("Alex","Harald",Gender.MALE,catsAlex);
        alex.listCats();
        System.out.println(alex);

    }
}