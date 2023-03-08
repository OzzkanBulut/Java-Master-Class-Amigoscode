package booking;

import car.Car;
import user.User;

public class Booking {
    private User user;
    private Car car;

    public Booking(User user,Car car) {
        this.user = user;
        this.car = car;
    }

    public Booking() {
    }

    public User getUser() {
        return user;
    }

    public void setUserID(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
