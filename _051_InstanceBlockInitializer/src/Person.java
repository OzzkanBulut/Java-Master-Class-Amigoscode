public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public static int count = 0;

    {
        System.out.println("Instance initializer is called");
        count++;
        System.out.println("Count incremented in insance initializer: "+ count);
    }
    static{
        System.out.println("Start: static block initialization");
        count++;
        System.out.println("Count is incremented in static initializer: "+ count);
        System.out.println("End: static block initialization");
    }

    public Person() {
        System.out.println("No-arg constructor is called");
        count++;
        System.out.println("Count incremented in no-arg constructor: "+ count);

    }

    public Person(String firstName, String lastName, int age) {
        System.out.println("All-arg constructor is called");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
