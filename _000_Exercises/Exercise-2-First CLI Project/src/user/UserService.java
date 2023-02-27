package user;

public class UserService {

    private UserDAO userDAO;
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User[] getUsers(){
        return userDAO.getUsers();
    }
}
