package id.titus.ereg.service;

import id.titus.ereg.model.User;
import java.util.*

public interface UserService {
    public User getUser(String ID);

    public User addUser(User user);

    public long getUserCount();

    public List<User> listUser();
}
