package com.youcode.hephaestus.repositories;

import com.youcode.hephaestus.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
