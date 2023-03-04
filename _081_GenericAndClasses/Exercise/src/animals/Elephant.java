package animals;

public class Elephant extends Animal{
    private String elephantSomething;

    public Elephant(String name, int age, boolean isWild) {
        super(name, age);
        isWild = false;
    }

    public String getElephantSomething() {
        return elephantSomething;
    }

    public void setElephantSomething(String elephantSomething) {
        this.elephantSomething = elephantSomething;
    }
}

