package com.youcode.hephaestus.repositories;

import com.youcode.hephaestus.entities.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Orders, String> {

    int countByStatus(String pending);
}

