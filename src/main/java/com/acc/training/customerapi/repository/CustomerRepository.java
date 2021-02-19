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

    private static void initCustomer(){
        Customer cust1 = new Customer();
        cust1.setCustomerAddress("customerAddress");
        cust1.setCustomerName("customerName");
        cust1.setCustomerId("12345");

        Customer cust2 = new Customer();
        cust2.setCustomerAddress("customerAddress2");
        cust2.setCustomerName("customerName2");
        cust2.setCustomerId("67890");
        
        customerMap.put("12345", cust1);
        customerMap.put("67890", cust2);
    }

    public Customer getCustomer(String custId){
        return customerMap.get(custId);
     }

    public Customer addCustomer(Customer customer){
        customerMap.put(customer.getCustomerId(), customer);
        return customer;
    }

    
}
