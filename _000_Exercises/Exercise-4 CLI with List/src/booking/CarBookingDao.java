package booking;

import car.Car;
import user.User;

public interface CarBookingDao {

    public void makeBooking(User user, Car car);
}
