package com.acme.sales.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
//this provides all the basic functionality right out of the box -- pg 28, slide 84 Java for C#