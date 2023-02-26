package car;

public class CarService {

    private CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    public void registerNewCar(Car car) throws Exception {
        // Check if car is not null
        // Check if reg number is valid
        // Check if reg number is not taken
        // if price is <0
        carDAO.saveCar(car);
    }
    public Car[] getCars(){
      return carDAO.selectAllCars();
    }


}
