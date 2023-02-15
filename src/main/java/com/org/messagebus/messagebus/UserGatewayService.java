package com.org.messagebus.messagebus;

import com.org.messagebus.model.User;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import java.util.List;

@MessagingGateway
public interface UserGatewayService {

    @Gateway(requestChannel = "addUserInputChannel")
    void addUser(User user);

    @Gateway(requestChannel = "getAllUsersInputChannel", replyChannel = "gettAllUserOutputChannel")
    List<User> getAllUsers();


//
//    @Gateway(requestChannel = "getUserByIdInputChannel", replyChannel = "getUserByIdOutputChannel")
//    User getUserById(Long id);
//
//    @Gateway(requestChannel = "deleteUserByIdInputChannel", replyChannel = "deleteUserByIdOutputChannel")
//    void deleteUserById(Long id);
//
//    @Gateway(requestChannel = "updateUserInputChannel", replyChannel = "updateUserOutputChannel")
//    void updateUser(User user);
}