package animals;

public class Elephant extends Animal{
    private String elephantSomething;

    public Elephant(String name, int age) {
        super(name, age);
        boolean isAgressive = false;
    }

    public String getElephantSomething() {
        return elephantSomething;
    }

    public void setElephantSomething(String elephantSomething) {
        this.elephantSomething = elephantSomething;
    }
}

