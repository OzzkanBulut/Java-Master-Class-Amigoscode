package user;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUser(String name);
}
