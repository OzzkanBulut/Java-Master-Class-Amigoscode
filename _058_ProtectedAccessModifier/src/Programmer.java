public class Programmer extends Employee {
    private String[] programmingLanguages = {"C", "Java"};

    public Programmer(String name, int age) {
        super(name, age);
    }

    public Programmer(String name, int age, String[] programmingLanguages) {
        super(name, age);
        this.programmingLanguages = programmingLanguages;

    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode(){
        this.sayHi();
        System.out.println(this.name + " Write some code"); // we cannot reach name if it's private.It must be protected
//        this.age  is not accessible because age is private. It must be protected!
    }
    public void sayHi(){
        System.out.println("Programmer says Hi");
    }
}
