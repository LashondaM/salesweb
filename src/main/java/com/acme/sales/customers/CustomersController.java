package com.acme.sales.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomersController {
	
	@Autowired
	private CustomerRepository custRepo;
	
	@GetMapping
	public Iterable<Customer> GetAll() {
		return custRepo.findAll(); // in c# we would have to use Async, await, etc
	}
}
