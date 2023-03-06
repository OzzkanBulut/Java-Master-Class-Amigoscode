import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {
    PersonDAO personDAO = new PersonDAO();
    @Test
    public void imperativeApproach() {


        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        List<Person> people = personDAO.getPeople();
        List<Person> youngPeople = new ArrayList<>();
        int limit = 10;
        int counter = 0;

        for (Person person : people) {
            if (person.getAge() <= 18) { // ages will be 18 or less
                youngPeople.add(person);
                counter++;
                if (counter == limit) {
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);
    }

    @Test
    public void declarativeApproach(){
        List<Person> people = personDAO.getPeople();
        List<Person> oldPeople = people.stream().filter(p -> p.getAge() >= 18).limit(10).toList();
        List<Person> youngPeople = people.stream().filter(p -> p.getAge() <= 18).limit(10).toList();
        youngPeople.forEach(System.out::println);
        oldPeople.forEach(System.out::println);

    }
}
