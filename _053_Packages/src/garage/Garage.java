package garage;

import car.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Garage { // the garage model
    // Does not contain any business logic
    // pojo
    // Can hold number of cars

    private int number;
    private int capacity;
    private List<Car> cars;

    public Garage() {
    }

    public Garage(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
        return number == garage.number && capacity == garage.capacity && Objects.equals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, capacity, cars);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", cars=" + cars +
                '}';
    }

}
