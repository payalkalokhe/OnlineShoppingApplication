package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.application.dto.CustomerDTO;
import com.application.service.CustomerService;

@RestController
@RequestMapping("/customers")
@RestControllerAdvice
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

	@ExceptionHandler(Throwable.class)
    public ResponseEntity<?> handleException(Throwable t)  {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
