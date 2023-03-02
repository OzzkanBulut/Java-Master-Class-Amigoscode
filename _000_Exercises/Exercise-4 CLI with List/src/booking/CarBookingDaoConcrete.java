package booking;

import car.Car;
import user.User;

public class CarBookingDaoConcrete implements CarBookingDao{
    @Override
    public void makeBooking(User user, Car car) {
        CarBooking carBooking = new CarBooking(user, car);
        System.out.println(carBooking);
    }
}
