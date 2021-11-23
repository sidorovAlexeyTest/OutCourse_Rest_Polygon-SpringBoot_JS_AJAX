package org.sidorov.spring_boot_rest_1.controller_rest;

import org.sidorov.spring_boot_rest_1.model.User;
import org.sidorov.spring_boot_rest_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserRestController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all")
    public List<User> getAllUsers() {
        return userService.readAllUsers();
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable(name = "id") long id) {
        return userService.readUserById(id);
    }
}
