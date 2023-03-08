import booking.CarBookingDao;
import booking.CarBookingDaoConcrete;
import booking.CarBookingService;
import car.Car;
import car.CarDao;
import car.CarService;
import user.UserArrayDataService;
import user.UserDao;

public class Main {
    public static void main(String[] args) throws Exception {
        CarBookingDao carBookingDao = new CarBookingDaoConcrete();
        CarBookingService carBookingService = new CarBookingService(carBookingDao);
        UserDao userDao = new UserArrayDataService();
        CarDao carDao = new CarDao();
        carBookingService.makeBooking(userDao.getUser("James"),carDao.getCar("123"));
    }
}