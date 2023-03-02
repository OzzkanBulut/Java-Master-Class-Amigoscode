import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("özkan"),new Diamond("Turkish Diamond"));
        System.out.println(map.get(new Person("özkan"))); // its null because we didnt override the hashcode method

        System.out.println("Özkan".hashCode());
        System.out.println(new String("Özkan").hashCode()); // values are same, so hashcode is same too
        // we have to override the hashcode !
        // otherwise, even though the objects are identical, hashcodes will be different!




    }

    private static void maap(){
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("Özkan"));
        map.put(2,new Person("Alex"));
        map.put(3,new Person("Alexa"));
        map.put(3,new Person("Alexa"));
        map.put(1,new Person("Özkan new"));

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        for( Map.Entry<Integer, Person> i : map.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }


        map.remove(1);
        System.out.println(map.getOrDefault(4,new Person("Default")));

        System.out.println(map);
    }
}
class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // create a unique hashcode for the object value
    }
}
record Diamond(String name){}