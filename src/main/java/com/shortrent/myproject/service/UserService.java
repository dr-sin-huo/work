package com.shortrent.myproject.service;


import com.shortrent.myproject.generator.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(Integer usrId);

    User getUser(Integer usrId);

    void updateUser(User user);

    List<User> getUserByphone(User user);

    List<User> getAll();
}
