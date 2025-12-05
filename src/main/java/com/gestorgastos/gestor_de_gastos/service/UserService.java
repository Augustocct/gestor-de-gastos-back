package com.gestorgastos.gestor_de_gastos.service;

import com.gestorgastos.gestor_de_gastos.model.User;
import com.gestorgastos.gestor_de_gastos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
