package com.youcode.hephaestus.services;

import com.youcode.hephaestus.entities.User;
import com.youcode.hephaestus.repositories.UserReository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    UserReository userReository;

    public List<User> getAll(){
        return userReository.findAll();
    }
    public User addUser(User user){
        return userReository.save(user);
    }

}
