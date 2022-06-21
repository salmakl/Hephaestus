package com.youcode.hephaestus.services;

import com.youcode.hephaestus.dto.models.UserDto;
import com.youcode.hephaestus.dto.services.IMapDto;
import com.youcode.hephaestus.entities.User;
import com.youcode.hephaestus.repositories.UserReository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class UserService {

    UserReository userReository;

    IMapDto<User, UserDto> userMapping;

    public List<UserDto> getAll(){
        log.info("Retrieving all users");
        List<User> users= userReository.findAll();
        return userMapping.convertListToListDto(users, UserDto.class);
    }
    public User addUser(User user){
        return userReository.save(user);
    }

    public User getUserById(String id){
        return userReository.findById(id).get();
    }


    public User changePassword(String id, String password){
        User user = userReository.findById(id).get();
        user.setPassword(password);
        return userReository.save(user);
    }


}
