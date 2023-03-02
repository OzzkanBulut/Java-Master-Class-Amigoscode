public class Laptop extends TechStuff {
    private String laptopSomething;

    public Laptop(String name, int price, String laptopSomething) {
        super(name, price);
        this.laptopSomething = laptopSomething;
    }

    public String getLaptopSomething() {
        return laptopSomething;
    }

    public void setLaptopSomething(String laptopSomething) {
        this.laptopSomething = laptopSomething;
    }
}
