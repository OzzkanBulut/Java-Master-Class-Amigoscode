package animals;

public class Crocodile extends Animal{
    private String crocodileSomething;

    public Crocodile(String name, int age, boolean isAgressive, String crocodileSomething) {
        super(name, age, isAgressive);
        this.crocodileSomething = crocodileSomething;
    }

    public String getCrocodileSomething() {
        return crocodileSomething;
    }

    public void setCrocodileSomething(String crocodileSomething) {
        this.crocodileSomething = crocodileSomething;
    }
}
