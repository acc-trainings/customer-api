package com.acc.training.customerapi.mongoRepo;

import com.acc.training.customerapi.domain.CustomerDomain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerMongoRepo extends MongoRepository<CustomerDomain, String> {

    public CustomerDomain findByCustomerId(String customerId);
    
}
