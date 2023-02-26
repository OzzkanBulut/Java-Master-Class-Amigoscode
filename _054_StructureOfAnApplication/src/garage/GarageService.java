package garage;

import car.Car;

public class GarageService {
    private Garage garage;

    public GarageService() {
    }

    public GarageService(Garage garage) {
        this.garage = garage;
    }
    public void addToGarage(Car car, Garage garage) throws Exception {
        if(garage.getCars().size() >= garage.getCapacity()){
            throw new Exception("Garage is full!");
        }
        garage.getCars().add(car);
        System.out.println(car.getBrand()+" added to garage");
    }

}
