package car;

public class CarService {
    CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public CarService() {
    }

    public Car getCar(int id){
        return carDAO.getCar(id);
    }

    public Car[] getCars(){
        return carDAO.getCars();
    }
}
