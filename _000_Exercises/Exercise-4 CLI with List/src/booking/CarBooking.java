package booking;

import car.Car;
import user.User;

import java.util.Objects;

public class CarBooking {
    private User user;
    private Car car;

    public CarBooking(User user, Car car) {
        this.user = user;
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "user=" + user +
                ", car=" + car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBooking that = (CarBooking) o;
        return Objects.equals(user, that.user) && Objects.equals(car, that.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, car);
    }
}
