package animals;

import java.util.List;

public class CageManager {

    private List<Animal> animals;

    public CageManager(List<Animal> animals) {
        this.animals = animals;
    }

    List<Animal> getAnimals(){
        return this.animals;
    }

    void setCage(List<Animal> animals){


    }
}
