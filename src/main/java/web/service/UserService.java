package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    User updateUser(User user);
    void deleteUserFromTable(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
}
