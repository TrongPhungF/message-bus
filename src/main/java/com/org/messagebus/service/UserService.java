package com.org.messagebus.service;

import com.org.messagebus.model.User;
import com.org.messagebus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }


//        List<User> findAll();
//
//        User findById(Long id);
//
//        void deleteById(Long id);
//
//        User update(User user);
}