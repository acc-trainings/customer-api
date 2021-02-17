package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    private static final Map<String,Customer> customerMap= new HashMap<>();
    
    static{
        initCustomer();
    }

    private static void initCustomer() {
        Customer cust1 = new Customer();
        cust1.setCustomerId("C00000001");
        cust1.setCustomerName("Bill Gates");

        customerMap.put(cust1.getCustomerId(),cust1);
    }

    public Customer getCustomer(String custId)
    {
        return customerMap.get(custId);
    }

    public Customer addCustomer(Customer cust)
    {
         customerMap.put(cust.getCustomerId(),cust);
         return cust;
    }
}
