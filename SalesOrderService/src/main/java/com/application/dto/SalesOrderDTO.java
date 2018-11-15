package com.application.dto;

import java.util.Date;
import java.util.List;

import com.application.model.OrderLineItem;

public class SalesOrderDTO {
	
	private Long id;
	private Date orderDate;
	private Long customerId;
	private String orderDesc;
	private Double totalPrice;
	private List<OrderLineItem> orderLineItems;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<OrderLineItem> getOrderLineItems() {
		return orderLineItems;
	}
	public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}
	
	

}
