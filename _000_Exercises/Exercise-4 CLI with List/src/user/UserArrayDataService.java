package user;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class UserArrayDataService implements UserDao {

    private static final User[] users;

    static {
        users = new User[]{
                new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "James"),
                new User(UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"), "Jamila")
        };
    }


    @Override
    public List<User> getAllUsers() {
        return Arrays.asList(users);
    }

    @Override
    public User getUser(String name) {
        for(User user:users){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
}
