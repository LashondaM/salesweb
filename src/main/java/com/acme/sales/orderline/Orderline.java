package com.acme.sales.orderline;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.acme.sales.order.Order;

@Entity(name="orderlines")
public class Orderline {

	// Primary Key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, nullable=false)
	private String product;
	
	private int quantity;
	private int price;
	
	// Foreign Key
	@ManyToOne(optional=false)
	@JoinColumn(name="orderId")
	public Order order;
	
	//another FK
//	@ManyToOne(optional=false)
//	@JoinColumn(name="productId")
//	public Product product;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
