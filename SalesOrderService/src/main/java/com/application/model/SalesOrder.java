package com.application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SALES_ORDER")
public class SalesOrder {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;

	@Column(name="ORDER_DATE")
	private Date orderDate;

	@Column(name="CUST_ID")
	private Long customerId;

	@Column(name="ORDER_DESC")
	private String orderDesc;

	@Column(name="TOTAL_PRICE")
	private Double totalPrice;

	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "salesOrder")
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
