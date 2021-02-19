package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.domain.CustomerDomain;
import com.acc.training.customerapi.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepository extends MongoRepository<CustomerDomain, String> {

   public CustomerDomain findByCustomerId(String customerId);
    
    
}
