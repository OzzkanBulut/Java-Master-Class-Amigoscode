import car.Brand;
import car.Car;
import garage.Garage;
import garage.GarageService;

import java.math.BigDecimal;

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
        garageService.addToGarage(car3,myGarage);

    }
}