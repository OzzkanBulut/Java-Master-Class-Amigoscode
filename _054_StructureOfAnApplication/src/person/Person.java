package person;

import car.Car;
import garage.Garage;

import java.util.List;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<Car> cars;
    private Garage garage;

    public Person() {
    }

    public Person(String firstName, String lastName, int age,Garage garage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.garage = garage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(cars, person.cars) && Objects.equals(garage, person.garage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, cars, garage);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                ", garage=" + garage +
                '}';
    }
}
