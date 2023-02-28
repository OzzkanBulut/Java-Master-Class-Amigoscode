import user.UserManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(Arrays.toString(userManager.getUsers()));
    }
}