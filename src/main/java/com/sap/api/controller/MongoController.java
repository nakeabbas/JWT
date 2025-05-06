/*
package com.sap.api.controller;

import com.sap.api.mode.UsersDetails;
import com.sap.api.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class MongoController {


    @Autowired
    private MongoService userService;

    // Create or Update a user
    @PostMapping
    public ResponseEntity<UsersDetails> createUser(@RequestBody UsersDetails user) {
        UsersDetails savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Get all users
    @GetMapping
    public List<UsersDetails> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<UsersDetails> getUserById(@PathVariable String id) {
        Optional<UsersDetails> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update user by ID (same endpoint as create since we're using @PostMapping)
    @PutMapping("/{id}")
    public ResponseEntity<UsersDetails> updateUser(@PathVariable String id, @RequestBody UsersDetails user) {
        user.setId(id);
        UsersDetails updatedUser = userService.saveUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
*/
