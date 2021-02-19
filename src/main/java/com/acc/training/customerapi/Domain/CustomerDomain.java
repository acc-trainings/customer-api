package com.acc.training.customerapi.Domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;


@Document(collection ="Customer-Jayesh")
public class CustomerDomain {

@Id
private String id;

private String customerId;

private String customerName;

private String customerAddress;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}