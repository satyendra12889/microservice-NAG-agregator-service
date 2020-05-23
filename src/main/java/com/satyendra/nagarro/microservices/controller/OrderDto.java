package com.satyendra.nagarro.microservices.controller;

public class OrderDto {
	
	public int orderId;
	
	public int orderAmount;
	
	public String orderDate;
	
	
	public OrderDto(Order order) {
		this.orderId = order.id;
		this.orderAmount  = order.orderAmount;
		this.orderDate = order.orderDate;
		
	}
	

}
