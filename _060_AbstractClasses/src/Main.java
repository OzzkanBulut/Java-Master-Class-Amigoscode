public class Main {
    public static void main(String[] args) {
//        new Animal("bobby"); --> Doesnt work!
        Animal dog = new Dog("fool"); // dog is an animal, we can do thisd
        Animal cat = new Cat("bar");
        dog.makeSound();
        cat.makeSound();


    }
}