package com.example.AuthenticationApp.services.impl;

import com.example.AuthenticationApp.models.User;
import com.example.AuthenticationApp.repositories.UserRepository;
import com.example.AuthenticationApp.services.AuthentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthentificationServiceImpl implements AuthentificationService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if (userRepository.findAllByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Bu email artıq qeydiyyatdan keçib!");
        }
        return userRepository.save(user);
    }


    public User loginUser(String email, String rawPassword) {
        User userProfile = userRepository.findAllByEmail(email).orElseThrow();

        if (userProfile.getPassword().equals(rawPassword)) {
            return userProfile;
        } else {
            throw new RuntimeException("Email ve ya sifre yanlisdir");
        }
    }
}
