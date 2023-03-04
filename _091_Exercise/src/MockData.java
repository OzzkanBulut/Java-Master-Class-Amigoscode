import java.util.List;

public class MockData {
    private final PersonDAO personDAO;

    public MockData(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public  List<Person> getPeople() {
        return personDAO.getPeople();
    }
}
