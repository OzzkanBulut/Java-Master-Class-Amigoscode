package animals;

public class Crocodile extends Animal{
    private String crocodileSomething;

    public Crocodile(String name, int age) {
        super(name, age);
        boolean isAgressive = true;
    }

    public String getCrocodileSomething() {
        return crocodileSomething;
    }

    public void setCrocodileSomething(String crocodileSomething) {
        this.crocodileSomething = crocodileSomething;
    }
}
