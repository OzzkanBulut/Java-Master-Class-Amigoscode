import car.Brand;
import car.Car;
import cat.Cat;
import person.Gender;
import person.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Packages --> The organization
        // Domain / Model --> Your entities. They are just data.No business logic in here!
        // Service Classes -> Business Logic
        // DAO Classes
        // Utility Classes
        // Configuration Classes

        List<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Cumali","Black",2);
        Cat cat2 = new Cat("Namık","Yellow",3);
        cats.add(cat2);
        cats.add(cat1);

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(Brand.BMW,"x23", new BigDecimal("233333"));
        Car car2 = new Car(Brand.TOFAS,"2", new BigDecimal("10000"));
        cars.add(car1);
        cars.add(car2);

        Person özkan = new Person("Özkan",
                "Bulut",
                24,
                Gender.MALE,
                cats,
                cars
                );
        System.out.println(özkan);
    }
}