public class Programmer extends Employee {
    private String[] programmingLanguages = {"C", "Java"};

    public Programmer(String name, int age) {
        super(name, age);
    }

    public Programmer(String name, int age, String[] programmingLanguages) {
        super(name, age);
        this.programmingLanguages = programmingLanguages;

    }
}
