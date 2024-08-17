import java.util.ArrayList;

public class UserMethods {

    private ArrayList<User> dbUsers = new ArrayList<>();

    public void onCreate(User user) {
        this.dbUsers.add(user);
    };

    public ArrayList<User> getUsers() { return this.dbUsers; };
}
