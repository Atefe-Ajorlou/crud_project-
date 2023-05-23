import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    // Create operation
    public void addUser(User user) {
        users.add(user);
    }

    // Read operation
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // Update operation
    public void updateUser(User updatedUser) {
        for (User user : users) {
            if (user.getId() == updatedUser.getId()) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                break;
            }
        }
    }

    // Delete operation
    public void deleteUser(int id) {
        User userToRemove = null;

        for (User user : users) {
            if (user.getId() == id) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            users.remove(userToRemove);
        }
    }
}
