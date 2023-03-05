package animals;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CageManager {

    private List<Animal> animals;

    public CageManager(List<Animal> animals) {
        this.animals = animals;
    }

    List<Animal> getAnimals() {
        return this.animals;
    }

    void setCage(List<Animal> animals) throws Exception {
        for (int i = 0; i < animals.size() - 1; i++) {
            for (int j = 1; j < animals.size(); j++) {
                if (!animals.get(i).isAgressive() == animals.get(j).isAgressive()) {
                    throw new Exception("Agressive animals can not be put into a cage with safe animals!");
                }
            }

        }
    }

}

