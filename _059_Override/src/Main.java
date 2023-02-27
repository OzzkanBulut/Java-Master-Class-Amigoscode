public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal",2);
        Cat cat = new Cat("cat",12);
        Dog dgo = new Dog("dog",12);
        Animal dog = new Dog("dog1",2);
        cat.makeSound();
        dgo.makeSound();
        animal.makeSound();
    }
}