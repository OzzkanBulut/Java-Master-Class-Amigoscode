public class Television extends TechStuff {
    private String tvSomething;

    public Television(String name, int price, String tvSomething) {
        super(name, price);
        this.tvSomething = tvSomething;
    }

    public String getTvSomething() {
        return tvSomething;
    }

    public void setTvSomething(String tvSomething) {
        this.tvSomething = tvSomething;
    }
}
