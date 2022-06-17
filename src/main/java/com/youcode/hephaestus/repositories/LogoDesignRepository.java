package com.youcode.hephaestus.repositories;

import com.youcode.hephaestus.entities.LogoDesign;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogoDesignRepository extends MongoRepository<LogoDesign, String> {
}
