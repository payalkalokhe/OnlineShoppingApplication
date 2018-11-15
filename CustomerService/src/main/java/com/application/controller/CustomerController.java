package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.dto.CustomerDTO;
import com.application.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/")
	public List<CustomerDTO> getAllCustomers() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/{id}")
	public CustomerDTO get(Long id) {
		return customerService.get(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(Long id) {
		customerService.delete(id);
	}
	
	@PostMapping("/")
	public CustomerDTO add(CustomerDTO customerDTO) {
		return customerService.save(customerDTO);
	}
	
	@PutMapping("/{id}")
	public CustomerDTO update(Long id, CustomerDTO customerDTO) {
		customerDTO.setId(id);
		return customerService.save(customerDTO);
	}

}
