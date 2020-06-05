package com.rsjava.doogbook.controller;

import com.rsjava.doogbook.model.User;
import com.rsjava.doogbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
