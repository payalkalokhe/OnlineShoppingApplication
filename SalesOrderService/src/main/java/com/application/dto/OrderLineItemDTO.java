package com.application.dto;

public class OrderLineItemDTO {

	private Long id;
	private String itemName;
	private Long itemQuantity;
	
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


}
