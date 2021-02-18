package com.acc.training.customerapi.controller;

import javax.validation.Valid;

import com.acc.training.customerapi.api.CustomerApi;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//IMPORT API CUSTOMER API PACKAGE

//IMPORT MODEL CUSTOMER

@RestController
public class CustomerController implements CustomerApi {

    @Autowired
    private CustomerService service;

    @Override
    public ResponseEntity<Customer> createCustomer(@Valid Customer body) {
        // TODO Auto-generated method stub
        //There was an inital error when importing dependencies from the yaml file the request body was nested incorrectly, this method intially took in a string instead of a customer object

        Customer result = service.createCustomer(body);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @Override
    public ResponseEntity<Customer> getCustomer(String id) {
        // TODO Auto-generated method stub

        Customer result = service.getCustomer(id);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    

}
