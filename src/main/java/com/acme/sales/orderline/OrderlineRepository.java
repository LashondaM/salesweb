package com.acme.sales.orderline;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderlineRepository extends JpaRepository<Orderline, Integer> {

}
//this provides all the basic functionality right out of the box -- pg 28, slide 84 Java for C#