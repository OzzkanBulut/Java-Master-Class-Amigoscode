package animals;

public class Elephant extends Animal{
    private String elephantSomething;

    public Elephant(String name, int age, boolean isAgressive, String elephantSomething) {
        super(name, age, isAgressive);
        this.elephantSomething = elephantSomething;
    }

    public String getElephantSomething() {
        return elephantSomething;
    }

    public void setElephantSomething(String elephantSomething) {
        this.elephantSomething = elephantSomething;
    }
}

