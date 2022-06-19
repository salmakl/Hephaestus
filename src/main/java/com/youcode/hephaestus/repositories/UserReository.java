package com.youcode.hephaestus.repositories;

import com.youcode.hephaestus.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserReository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);
}
