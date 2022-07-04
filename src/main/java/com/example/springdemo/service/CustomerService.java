package com.example.springdemo.service;

import com.example.springdemo.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);
    CustomerDTO getCustomer (int id);
}
