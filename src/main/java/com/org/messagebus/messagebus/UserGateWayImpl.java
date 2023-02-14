package com.org.messagebus.messagebus;

import com.org.messagebus.model.User;
import com.org.messagebus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserGateWayImpl implements UserGatewayService{

    @Autowired
    private UserService userService;

    @Override
    public User addUser(User user) {
       return userService.addUser(user);
    }

//    @Override
//    public List<User> getAllUsers() {
//        return userService.findAll();
//    }
//
//    @Override
//    public User getUserById(Long id) {
//        return userService.findById(id);
//    }
//
//    @Override
//    public void deleteUserById(Long id) {
//        userService.deleteById(id);
//    }
//
//    @Override
//    public void updateUser(User user) {
//        userService.update(user);
//    }
}
