package org.sidorov.spring_boot_rest_1.postConstruct;

import org.sidorov.spring_boot_rest_1.model.User;
import org.sidorov.spring_boot_rest_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class AddUsersAfterCreate {

    private UserService userService;

    @Autowired
    private void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void addUsers(){
        List<User> userList = List.of(new User("Alex", (short)22),
                new User("Petr", (short)25),
                new User("Evgen", (short)18));
        userList.forEach(userService::addUser);
    }

}
