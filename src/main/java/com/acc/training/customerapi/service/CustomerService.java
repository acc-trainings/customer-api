package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.domain.CustomerDomain;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.mongoRepo.CustomerMongoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

   @Autowired
    private CustomerMongoRepo customerMongoRepo;

	public Customer createCustomer(@Valid Customer body) {

		CustomerDomain customerDomain = mapModelToDomain(body);

		return mapDomainToModel(customerMongoRepo.save(customerDomain));
		
	}



	public CustomerDomain mapModelToDomain(Customer body){

		CustomerDomain customerDomain = new CustomerDomain();
		customerDomain.setCustomerName(body.getCustomerName());
		customerDomain.setCustomerId(body.getCustomerId());
		customerDomain.setCustomerAddress(body.getCustomerAddress());
		return customerDomain;
	
	}

	public Customer mapDomainToModel(CustomerDomain body){

		Customer customer = new Customer();
		customer.setCustomerName(body.getCustomerName());
		customer.setCustomerId(body.getCustomerId());
		customer.setCustomerAddress(body.getCustomerAddress());
		return customer;
	
	}

	public Customer getCustomer(String id) {
		return mapDomainToModel(customerMongoRepo.findByCustomerId(id));

	}
    
}



//Code from hardcoded example
// @Service
// public class CustomerService {

//    @Autowired
//     private CustomerRepo customerRepo;

// 	public Customer createCustomer(@Valid Customer body) {
// 		return customerRepo.addCustomer(body);
// 	}

// 	public Customer getCustomer(String id) {
// 		return customerRepo.getCustomer(id);

// 	}
    
// }
