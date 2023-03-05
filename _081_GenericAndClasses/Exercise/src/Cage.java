import animals.Animal;

import java.util.List;
import java.util.Objects;

public class Cage <T extends Animal> {
    private List<T> animals;

    public Cage(List<T> animals) {
        this.animals = animals;
    }

    public Cage() {
    }

    public List<T> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Cage{" +
                "animals=" + animals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cage<?> cage = (Cage<?>) o;
        return Objects.equals(animals, cage.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animals);
    }
}
