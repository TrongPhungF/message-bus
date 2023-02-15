package com.org.messagebus.controller;

import com.org.messagebus.messagebus.UserGatewayService;
import com.org.messagebus.model.User;
import com.org.messagebus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private  UserGatewayService userGatewayService;

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        System.out.println("user: " + user);
        userGatewayService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userGatewayService.getAllUsers();
    }

}
