package com.postgresql.app.controllers;

import com.postgresql.app.entities.Customer;
import com.postgresql.app.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> listOfCustomer() {
        return this.customerRepository.findAll();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer newCustomer) {
        return this.customerRepository.save(newCustomer);
    }
}
