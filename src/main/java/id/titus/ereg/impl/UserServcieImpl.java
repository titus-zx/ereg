package id.titus.ereg.impl;

import javax.inject.Named;

import id.titus.ereg.model.User;
import id.titus.ereg.service.UserService;

@Named("userService")
public class UserServcieImpl implements UserService{

    @Override
    public User getUser(String ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUser'");
    }

    @Override
    public User addUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addUser'");
    }

    @Override
    public long getUserCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserCount'");
    }
    
}
