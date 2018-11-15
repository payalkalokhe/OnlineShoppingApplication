package com.application.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.CustomerDTO;
import com.application.model.Customer;
import com.application.repository.CustomerRepository;

@Transactional
@Service
public class CustomerService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<CustomerDTO> getAllCustomer(){
		return customerRepository.findAll().stream().map(c -> modelMapper.map(c, CustomerDTO.class))
				.collect(Collectors.toList());	 	
	}
	
	public CustomerDTO get(Long id) {
		return modelMapper.map(customerRepository.findById(id),CustomerDTO.class);
	}
	
	public CustomerDTO save(CustomerDTO customerDTO) {
		Customer customer = customerRepository.save(modelMapper.map(customerDTO, Customer.class));
		CustomerDTO result = modelMapper.map(customer, CustomerDTO.class);
		return result;
	}

	public void delete(Long id) {
		customerRepository.deleteById(id);
	}
	 

}
