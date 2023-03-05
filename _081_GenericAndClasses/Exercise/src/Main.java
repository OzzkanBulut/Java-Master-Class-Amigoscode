import animals.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cage<Animal> animalCage = new Cage<>();
        CageManager cageManager = new CageManager(List.of(new Bear("bear",2,true),new Lion("lion",2,true,"asdf"),new Giraffe("giraffe",2,false)));
    }
}