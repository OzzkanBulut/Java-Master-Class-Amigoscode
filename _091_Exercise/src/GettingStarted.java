import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GettingStarted {

    @Test
    public void imperativeApproach() {

        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        PersonDAO personDAO = new PersonDAO();
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
}
