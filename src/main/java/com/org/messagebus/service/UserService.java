package com.org.messagebus.service;

import com.org.messagebus.model.User;
import com.org.messagebus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    void addUser(User user);
    List<User> findAll();

//        User findById(Long id);
//
//        void deleteById(Long id);
//
//        User update(User user);
}