package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

	public Customer createCustomer(@Valid Customer body) {
		return repo.addCustomer(body);
	}

	public Customer getCustomer(String id) {
		return repo.getCustomer(id);
	}
    
}
