package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findById(id);
    }
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
    @Transactional
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }


}
