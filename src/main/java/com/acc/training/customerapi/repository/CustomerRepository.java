package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    private static final Map<String, Customer> customerMap = new HashMap<>();

    private static void initCustomer() {

    Customer cust1=new Customer();
    cust1.setCustomerId("12345");
    cust1.setCustomerName("Pradeep");
    cust1.setCustomerAddress("New jersey");

    customerMap.put("12345", cust1);
    }

    public Customer getCustomer(String custId){
        return customerMap.get(custId);
    }

    public Customer addCustomer(Customer customer){
        customerMap.put (customer.getCustomerId(), customer);
        return customer;
    }
    
}
