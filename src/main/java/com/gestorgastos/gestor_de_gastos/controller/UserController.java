package com.gestorgastos.gestor_de_gastos.controller;

import com.gestorgastos.gestor_de_gastos.model.User;
import com.gestorgastos.gestor_de_gastos.repository.UserRepository;
import com.gestorgastos.gestor_de_gastos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }
}
