package com.example.customer.rest;

import com.example.customer.model.CustomerModel;

import com.example.customer.service.CustomerService;
import com.example.customer.shared.CustomerRequestModel;
import com.example.customer.shared.CustomerResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @PostMapping("/customers")
    public ResponseEntity<CustomerResponseModel> createCustomer(@RequestBody CustomerRequestModel customerRequestModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customerRequestModel));

    }
    @GetMapping("/customers")
    public ResponseEntity<List<CustomerModel>> getAllCustomer()
    {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }



}