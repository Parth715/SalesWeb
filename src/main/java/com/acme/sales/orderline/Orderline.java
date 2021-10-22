package com.acme.sales.orderline;

import javax.persistence.*;

import com.acme.sales.customer.Customer;
import com.acme.sales.order.Order;

@Entity(name = "orderlines")
public class Orderline {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, nullable=false)
	private String product;
	
	@Column(columnDefinition="int NOT NULL DEFAULT 1")
	private int quantity;
	
	private int price;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="orderId")
	private Order order;
	

}
