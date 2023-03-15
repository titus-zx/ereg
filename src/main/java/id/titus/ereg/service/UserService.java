package id.titus.ereg.service;

import id.titus.ereg.model.User;

public interface UserService {
    public User getUser(String ID);

    public User addUser(User user);

    public long getUserCount();
}
