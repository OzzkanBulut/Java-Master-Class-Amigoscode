public class Main {
    public static void main(String[] args) {
        System.out.println(1 + 1); // 2
        System.out.println("1" + "1"); // 11
        // This here is polymorpishm. + symbol has many forms. One for adding integers and one for concatin strings

        Animal pig = new Pig();
        Animal lion = new Lion();
        Animal[] animals = new Animal[]{lion,pig};
        for(Animal animal : animals){
            animal.makeSound();  // we used lion and pig as animal objects!
        }
    }
}