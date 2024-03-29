package com.youcode.hephaestus.repositories;

import com.youcode.hephaestus.entities.LogoDesign;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogoDesignRepository extends MongoRepository<LogoDesign, String> {
}
