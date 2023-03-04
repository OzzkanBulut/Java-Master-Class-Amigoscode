import java.util.List;

public class MockData {
    static PersonDAO personDAO;

    public MockData(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public static List<Person> getPeople() {
        return personDAO.getPeople();
    }
}
