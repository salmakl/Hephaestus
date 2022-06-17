package com.youcode.hephaestus.controllers;

import com.youcode.hephaestus.entities.User;
import com.youcode.hephaestus.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class UserController {
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
    @PostMapping("/store")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
