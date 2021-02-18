package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.repo.CustomerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

   @Autowired
    private CustomerRepo customerRepo;

	public Customer createCustomer(@Valid Customer body) {
		return customerRepo.addCustomer(body);
	}

	public Customer getCustomer(String id) {
		return customerRepo.getCustomer(id);

	}
    
}
