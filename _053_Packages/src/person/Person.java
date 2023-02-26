package person;

import car.Car;
import cat.Cat;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private Gender gender;

    private List<Cat> catList;

    private List<Car> carList;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, Gender gender, List<Cat> catList, List<Car> carList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.catList = catList;
        this.carList = carList;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", catList=" + catList +
                ", carList=" + carList +
                '}';
    }
}
