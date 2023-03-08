package booking;

import car.Car;
import user.User;

public class CarBookingService {
    private final CarBookingDao carBookingDao;

    public CarBookingService(CarBookingDao carBookingDao) {
        this.carBookingDao = carBookingDao;
    }
    public void makeBooking(User user, Car car){
        carBookingDao.makeBooking(user, car);
    }
}
