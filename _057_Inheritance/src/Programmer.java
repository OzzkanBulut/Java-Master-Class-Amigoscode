public class Programmer  extends Employee{

    private String[] programmingLanguages;
    public Programmer(String name,
                      int age,
                      String address,
                      String experience) {
        super(name, age, address, experience);
    }


    public Programmer(String name, int age, String address, String experience,String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
    public void writecode(){
        System.out.println("Code is written");
    }

}
