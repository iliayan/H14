import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDao implements Dao {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getOneUser() {
        if (!users.isEmpty()) {
            return users.get(0);
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void reverseUsers() {
        Collections.reverse(users);
    }
}