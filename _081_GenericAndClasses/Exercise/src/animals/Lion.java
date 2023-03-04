package animals;

public class Lion extends Animal{
    private String lionSomething;

    public Lion(String name, int age, boolean isWild) {
        super(name, age);
        isWild = true;
    }

    public String getLionSomething() {
        return lionSomething;
    }

    public void setLionSomething(String lionSomething) {
        this.lionSomething = lionSomething;
    }

}
