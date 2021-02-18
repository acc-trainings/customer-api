package com.acc.training.customerapi.repo;

import java.util.*;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

///import customer model

//import SPringframwork sterotype reposiory

@Repository
public class CustomerRepo {

    private static final Map<String, Customer> customerMap = new HashMap<>();

    static{
        intiCustomer();
    }

    private static void intiCustomer() {

        Customer client1 = new Customer();

        client1.setCustomerName("John Doe");
        client1.setCustomerId("2689");
        client1.setCustomerAddress("Bronx, NY");

        customerMap.put("2689", client1);

    }

    public Customer getCustomer(String customerId){
        return customerMap.get(customerId);

    }

    public Customer addCustomer(Customer customer){

        customerMap.put(customer.getCustomerId(), customer);
        return customer;
    }
    
}
