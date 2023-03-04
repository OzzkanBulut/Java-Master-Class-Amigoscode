import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GettingStarted {

    @Test
    public void imperativeApproach() {

        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        MockData mockData = new MockData(new PersonDAO(new Person("özkan",23)));
        List<Person> personList = mockData.getPeople();
        List<Person> youngPeople = new ArrayList<>();
        int count = 0;
        for(Person person : personList){
            if(person.getAge()<=18){
                youngPeople.add(person);
                count++;
                if(count==10){
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);


    }
}
