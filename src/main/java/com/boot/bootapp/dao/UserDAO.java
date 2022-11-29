package com.boot.bootapp.dao;

import com.boot.bootapp.model.User;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Integer id);
    void updateUser(User user, int id);
    User getUserById(int id);
}