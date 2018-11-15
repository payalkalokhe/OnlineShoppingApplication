package com.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_LINE_ITEM")
public class OrderLineItem {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name="ITEM_NAME")
	private String itemName;

	@Column(name="ITEM_QUANTITY")
	private Long itemQuantity;

	@ManyToOne
	@JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
	private SalesOrder salesOrder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}

	
	
}
