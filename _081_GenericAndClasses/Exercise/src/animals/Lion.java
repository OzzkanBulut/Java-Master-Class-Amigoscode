package animals;

public class Lion extends Animal{
    private String lionSomething;

    public Lion(String name, int age, boolean isAgressive, String lionSomething) {
        super(name, age, isAgressive);
        this.lionSomething = lionSomething;
    }

    public String getLionSomething() {
        return lionSomething;
    }

    public void setLionSomething(String lionSomething) {
        this.lionSomething = lionSomething;
    }

}
