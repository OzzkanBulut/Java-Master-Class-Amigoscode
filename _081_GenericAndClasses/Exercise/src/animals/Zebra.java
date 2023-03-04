package animals;

public class Zebra extends Animal{
    private String zebraSomething;

    public Zebra(String name, int age, boolean isWild) {
        super(name, age);
        isWild = false;
    }

    public String getZebraSomething() {
        return zebraSomething;
    }

    public void setZebraSomething(String zebraSomething) {
        this.zebraSomething = zebraSomething;
    }
}
