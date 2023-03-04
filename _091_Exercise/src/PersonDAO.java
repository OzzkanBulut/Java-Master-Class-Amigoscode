import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    Person person;
    public PersonDAO(Person person) {
        this.person = person;
    }
List<Person> personList;
     {
        personList = List.of(
                new Person("özkan",2),
                new Person("ahmet",23),
                new Person("ali",32),
                new Person("mehmet",2),
                new Person("rıdvan",1),
                new Person("özge",11),
                new Person("hatice",33),
                new Person("yücel",3),
                new Person("kartal",24),
                new Person("mete",43),
                new Person("hakkı",12),
                new Person("hakkıye",32),
                new Person("kaan",44),
                new Person("nuriye",22),
                new Person("ayşe",18),
                new Person("fatma",12),
                new Person("hayriye",31),
                new Person("malak",13),
                new Person("milak",14),
                new Person("uuu",551),
                new Person("aaa",12),
                new Person("özkan",17),
                new Person("özkan",19),
                new Person("özkan",17),
                new Person("özkan",23),
                new Person("özkan",32),
                new Person("özkan",42)
        );
    }
    public List<Person> getPeople(){
        return personList;
    }

}
