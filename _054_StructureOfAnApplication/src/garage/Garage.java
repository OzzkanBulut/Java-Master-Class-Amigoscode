package garage;

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Garage {
    private int number;
    private List<Car> cars;

    private int capacity;

    public Garage() {
    }

    public Garage(int number,int capacity) {
        this.number = number;
        this.capacity = capacity;
        cars = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return number == garage.number && Objects.equals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, cars);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "number=" + number +
                ", cars=" + cars +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
