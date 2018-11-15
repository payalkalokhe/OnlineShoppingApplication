package com.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_SOS")
public class CustomerSOS {
	@Id
	@GeneratedValue
	@Column(name="CUST_ID")
	private Long customerId;
	
	@Column(name="CUST_EMAIL")
	private String customerEmail;
	
	@Column(name="CUST_FIRST_NAME")
	private String customerFirstName;
	
	@Column(name="CUST_LAST_NAME")
	private String customerLastName;

	

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	
	
	
}
