package com.acme.sales.order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	List<Order> findByCustomerIdNot(int customerId); // orders that are not attached to this particular id
}
//this provides all the basic functionality right out of the box -- pg 28, slide 84 Java for C#