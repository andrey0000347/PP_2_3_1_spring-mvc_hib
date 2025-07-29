package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {
    void deleteUserById(Long id);
    void saveUser(User user);
    User findUserById(Long id);
    List<User> findAllUsers();
}
