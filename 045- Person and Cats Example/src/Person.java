import java.util.List;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    private List<Cat> cats;

    public Person() {
    }

    public Person(String firstName, String lastName, Gender gender, List<Cat> cats) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cats = cats;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cats=" + cats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, cats);
    }

    public void listCats(){
        System.out.println("Cats of "+this.getFirstName()+" : " );
        for(Cat cat:cats){
            System.out.print(cat.getName()+" ");
        }
    }
}
