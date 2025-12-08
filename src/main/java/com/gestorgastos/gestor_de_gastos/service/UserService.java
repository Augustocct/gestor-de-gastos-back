package com.gestorgastos.gestor_de_gastos.service;

import com.gestorgastos.gestor_de_gastos.model.User;
import com.gestorgastos.gestor_de_gastos.repository.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Email already in use");
        }
        return userRepository.save(user);
    }

    public User authenticateUser(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (!user.isPresent() || !user.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("Invalid email or password");
        }
        return user.get();
    }
}
