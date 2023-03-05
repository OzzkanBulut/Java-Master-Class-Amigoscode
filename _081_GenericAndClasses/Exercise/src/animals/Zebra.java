package animals;

public class Zebra extends Animal{
    private String zebraSomething;

    public Zebra(String name, int age, boolean isAgressive, String zebraSomething) {
        super(name, age, isAgressive);
        this.zebraSomething = zebraSomething;
    }

    public String getZebraSomething() {
        return zebraSomething;
    }

    public void setZebraSomething(String zebraSomething) {
        this.zebraSomething = zebraSomething;
    }
}
