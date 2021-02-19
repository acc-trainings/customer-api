package com.acc.training.customerapi.Controller;

import javax.validation.Valid;

import com.acc.training.customerapi.api.CustomerApi;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomerApi {

    @Autowired
    private CustomerService service;

    @Override
    public ResponseEntity<Customer> createCustomer(@Valid Customer body) {
  
        Customer result = service.createCustomer(body);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

	@Override
	public ResponseEntity<Customer> getCustomer(String id) {
        Customer result = service.getCustomer(id);

        return ResponseEntity.status(HttpStatus.OK).body(result);
	}
    
}
