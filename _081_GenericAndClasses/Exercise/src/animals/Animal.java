package animals;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean isAgressive;

    public Animal(String name, int age, boolean isAgressive) {
        this.name = name;
        this.age = age;
        this.isAgressive = isAgressive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAgressive() {
        return isAgressive;
    }

    public void setAgressive(boolean agressive) {
        isAgressive = agressive;
    }

    @Override
    public String toString() {
        return "animals.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isWild=" + isAgressive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isAgressive == animal.isAgressive && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isAgressive);
    }

}
