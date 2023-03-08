package car;

import java.util.List;

public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }

    public Car getCar(String regNumber) throws Exception {
        return carDao.getCar(regNumber);
    }

}
