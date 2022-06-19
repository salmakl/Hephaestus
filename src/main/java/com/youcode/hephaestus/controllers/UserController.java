package com.youcode.hephaestus.controllers;

import com.youcode.hephaestus.entities.User;
import com.youcode.hephaestus.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class UserController {
    UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.addUser(user);
    }
}
