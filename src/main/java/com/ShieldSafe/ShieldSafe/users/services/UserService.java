package com.ShieldSafe.ShieldSafe.users.services;

import org.springframework.stereotype.Service;
import com.ShieldSafe.ShieldSafe.users.entities.User;
import com.ShieldSafe.ShieldSafe.users.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
    }

    //change this after implementing password functionality
    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}