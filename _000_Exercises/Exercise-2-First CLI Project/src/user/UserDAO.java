package user;

import java.util.UUID;
public class UserDAO {
    private static final User[] users;
    static{
        users = new User[5];
    }

    public User[] getUsers(){
        return users;
    }



}
