package com.org.messagebus.service;

import com.org.messagebus.model.User;
import com.org.messagebus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
         userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
