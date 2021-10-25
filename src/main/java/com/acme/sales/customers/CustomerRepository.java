package com.acme.sales.customers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Customer findByCode(String code);
}
// this provides all the basic functionality right out of the box -- pg 28, slide 84 Java for C#