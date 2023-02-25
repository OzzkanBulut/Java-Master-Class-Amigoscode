public class Person {
    public static int count;

    static{
        System.out.println("Start: static block initialization");
        count = 0;
        System.out.println("End: static block initialization");
    }
    private String firstName;
    private String lastName;

    public Person() {
        System.out.println("Default constructor"); // this will be the last thing to printed. Because creating instance is
        // the last thing we do!
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
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
}
