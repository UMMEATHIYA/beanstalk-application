package com.example.customer.service;



import com.example.customer.model.CustomerModel;
import com.example.customer.shared.CustomerRequestModel;
import com.example.customer.shared.CustomerResponseModel;

import java.util.List;

public interface CustomerService {

    public CustomerResponseModel createCustomer(CustomerRequestModel customerDetails);

    public List<CustomerModel> getAllCustomers();

}