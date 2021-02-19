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
    private CustomerRepository repo;

	public Customer createCustomer(@Valid Customer body) {
		CustomerDomain customerDomain = mapModelToDomain(body);
        return mapDomainToModel(repo.save(customerDomain));
	}

    private CustomerDomain mapModelToDomain(Customer body) {
        CustomerDomain customerDomain = new CustomerDomain();
        customerDomain.setId(body.getCustomerId());
        customerDomain.setCustomerId(body.getCustomerId());
        customerDomain.setCustomerName(body.getCustomerName());
        customerDomain.setCustomerAddress(body.getCustomerAddress());
        return customerDomain;
    }

    private Customer mapDomainToModel(CustomerDomain body) {
        Customer customer = new Customer();
        customer.setCustomerId(body.getCustomerId());
        customer.setCustomerName(body.getCustomerName());
        customer.setCustomerAddress(body.getCustomerAddress());
        return customer;
    }

	public Customer getCustomer(String id) {
		return mapDomainToModel(repo.findByCustomerId(id));
	}
}
