package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.domain.CustomerDomain;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

	public Customer createCustomer(@Valid Customer body) {
		CustomerDomain customerDomain = mapModeltoDomain(body);
		return mapDomainToModel(repository.save(customerDomain));
	}

	private CustomerDomain mapModeltoDomain(Customer body) {
		CustomerDomain customerDomain = new CustomerDomain();
		customerDomain.setCustomerName(body.getCustomerName());
		customerDomain.setCustomerId(body.getCustomerId());
		customerDomain.setCustomerAddress(body.getCustomerAddress());
		return customerDomain;
	}

	private Customer mapDomainToModel(CustomerDomain body) {
		Customer customer = new Customer();
		customer.setCustomerName(body.getCustomerName());
		customer.setCustomerId(body.getCustomerId());
		customer.setCustomerAddress(body.getCustomerAddress());
		return customer;
	}


	public Customer getCustomer(String id) {
		return mapDomainToModel(repository.findByCustomerId(id));
	}
    
}
