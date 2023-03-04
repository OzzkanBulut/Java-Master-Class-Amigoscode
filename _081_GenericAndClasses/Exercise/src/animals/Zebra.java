package animals;

public class Zebra extends Animal{
    private String zebraSomething;

    public Zebra(String name, int age) {
        super(name, age);
        boolean isAgressive = false;
    }

    public String getZebraSomething() {
        return zebraSomething;
    }

    public void setZebraSomething(String zebraSomething) {
        this.zebraSomething = zebraSomething;
    }
}
