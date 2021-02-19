package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    private static final Map<String, Customer> customerMap = new HashMap<>();

    static{
        initCustomer();
    }

    private static void initCustomer() {
        Customer cust1 = new Customer();
        cust1.setCustomerId("123456");
        cust1.setCustomerName("Chaitanya");
        cust1.setCustoemrAdress("New Jersey");

        customerMap.put("123456", cust1);
    }

    public Customer getCustomer(String custId){
        return customerMap.get(custId);

    }

    public Customer addCustomer(Customer customer){
        customerMap.put(customer.getCustomerId(), customer);
        return customer;
    }
    
}
