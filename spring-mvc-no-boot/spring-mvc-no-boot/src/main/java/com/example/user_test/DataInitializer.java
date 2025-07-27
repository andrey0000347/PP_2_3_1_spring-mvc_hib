package com.example.user_test;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final UserRepository userRepository;


    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initializeUsers() {
        if (userRepository.findAll().isEmpty()) {
            userRepository.save(new User("Alex", "Barman"));
            userRepository.save(new User("Алексей", "Иванов"));
        }
    }
}
