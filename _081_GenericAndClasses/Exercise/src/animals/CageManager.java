package animals;

import java.util.List;

public interface CageManager {
    List<Animal> getAnimals();
    Animal getAnimal();
    void setCage(List<Animal> animals);
}
