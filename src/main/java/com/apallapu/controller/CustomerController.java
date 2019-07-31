package com.apallapu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.apallapu.model.Customer;
import com.apallapu.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id) {

		return customerService.getCustomer(id);
	}

}
