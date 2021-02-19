package com.acc.training.customerapi.repository;


import com.acc.training.customerapi.domain.CustomerDomain;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface CustomerRepository extends MongoRepository<CustomerDomain, String> {

    //saving data and retrieving data in this class.

    public CustomerDomain findByCustomerId(String CustomerId);

    
}
