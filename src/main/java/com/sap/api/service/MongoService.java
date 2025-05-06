/*
package com.sap.api.service;

import com.sap.api.mode.UserData;
import com.sap.api.mode.UsersDetails;
import com.sap.api.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoService {

    @Autowired
    UserDetailRepository userRepository;

    public UsersDetails saveUser(UsersDetails user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<UsersDetails> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public Optional<UsersDetails> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Delete user by ID
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    // Find user by email (custom method)
    public UsersDetails getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
*/
