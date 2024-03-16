package com.prueba1.prueba1.controllers;

import com.prueba1.prueba1.models.User;
import com.prueba1.prueba1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/genesis/users")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);

    }

}
