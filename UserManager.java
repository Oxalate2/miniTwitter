import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final UserManager instance = new UserManager();
    private static List<User> users;
    private static List<String> userNames;

    UserManager() {
        this.users = new ArrayList<>();
        this.userNames = new ArrayList<>();
    }

    public static UserManager getInstance() {
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public void addUser(User user) {
        users.add(user);
        userNames.add(user.getUserID());
    }

    public int getUsertotal() {
        return users.size();

    }

    public static boolean ifExists(String input) {
        return userNames.contains(input);
        
    }

}
