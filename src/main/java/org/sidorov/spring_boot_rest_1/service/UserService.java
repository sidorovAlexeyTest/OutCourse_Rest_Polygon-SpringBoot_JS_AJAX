package org.sidorov.spring_boot_rest_1.service;

import org.sidorov.spring_boot_rest_1.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User readUserByName(String name);
    User readUserById(long id);
    List<User> readAllUsers();
    void updateUser(User user);
    void deleteUserById(long id);
}
