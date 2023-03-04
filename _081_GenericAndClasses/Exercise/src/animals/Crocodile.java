package animals;

public class Crocodile extends Animal{
    private String crocodileSomething;

    public Crocodile(String name, int age, boolean isWild) {
        super(name, age, isWild);
    }

    public String getCrocodileSomething() {
        return crocodileSomething;
    }

    public void setCrocodileSomething(String crocodileSomething) {
        this.crocodileSomething = crocodileSomething;
    }
}
