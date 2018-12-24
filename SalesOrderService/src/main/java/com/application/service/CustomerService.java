package com.application.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.CustomerSOSDTO;
import com.application.messagelistener.CustomerMessageListener;
import com.application.messagelistener.CustomerMessageListener.Customer;
import com.application.repository.CustomerSOSRepository;
import com.application.model.CustomerSOS;

@Service
public class CustomerService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private CustomerSOSRepository customerSOSRepository;

	public CustomerSOSDTO save(CustomerMessageListener.Customer customer) {
		CustomerSOS customer2 = customerSOSRepository.save(modelMapper.map(customer, CustomerSOS.class));
		return modelMapper.map(customer2, CustomerSOSDTO.class);
	}
}
