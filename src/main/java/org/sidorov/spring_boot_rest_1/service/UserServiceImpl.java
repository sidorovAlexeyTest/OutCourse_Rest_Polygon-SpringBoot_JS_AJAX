package org.sidorov.spring_boot_rest_1.service;

import org.sidorov.spring_boot_rest_1.model.User;
import org.sidorov.spring_boot_rest_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    private void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User readUserByName(String name) {
        return userRepository.readUserByName(name);
    }

    @Override
    public User readUserById(long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> readAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
