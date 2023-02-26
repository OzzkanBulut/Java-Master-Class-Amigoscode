import car.Brand;
import car.Car;
import car.CarDAO;
import car.CarService;
import garage.Garage;
import garage.GarageService;
import person.Person;
import utils.StringUtils;

import java.math.BigDecimal;
import java.util.Arrays;

// Packages
// Model/Domain Classes
// Service Classes
// Data Access Object
// Controllers / REST API
// Utility Classes --> Classes that can be reused throughout every single package.Available for anyone!
// Configuration Classes


public class Main {
    public static void main(String[] args) throws Exception {
        Garage myGarage = new Garage(1,3);
        Car car1 = new Car(Brand.BMW,"x2",new BigDecimal(10_000));
        Car car2 = new Car(Brand.TOFAS,"2000",new BigDecimal(3_000));
        Car car3 = new Car(Brand.FORD,"1974",new BigDecimal(321_000));

        GarageService garageService = new GarageService(myGarage);

        garageService.addToGarage(car1,myGarage);
        garageService.addToGarage(car2,myGarage);
        garageService.addToGarage(car3,myGarage);

        Person özkan = new Person("Özkan","Bulut",3,myGarage);

        CarDAO carDAO = new CarDAO();
        CarService carService = new CarService(carDAO);
        carService.registerNewCar(car1);
        carService.registerNewCar(car1);
        System.out.println(Arrays.toString(carService.getCars()));;

        String example  ="dfjghn";
        System.out.println(StringUtils.isEmpty(example)); // we used string utils



    }
}