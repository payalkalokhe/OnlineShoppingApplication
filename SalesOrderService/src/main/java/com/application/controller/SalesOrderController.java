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

import com.application.dto.SalesOrderDTO;
import com.application.service.SalesOrderService;

@RestController
@RequestMapping("/salesorder")
@RestControllerAdvice
public class SalesOrderController {
	@Autowired
	private SalesOrderService salesOrderService;

	@GetMapping("/")
	public List<SalesOrderDTO> getAllSOS() {
		return salesOrderService.getAllSOS();
	}

	@GetMapping("/{id}")
	public SalesOrderDTO get(Long id) {
		return salesOrderService.get(id);
	}

	@PutMapping("/{id}")
	public SalesOrderDTO update(Long id, SalesOrderDTO salesOrderDTO) {
		salesOrderDTO.setId(id);
		return salesOrderService.save(salesOrderDTO);
	}

	@DeleteMapping("/{id}")
	public void delete(Long id) {
		salesOrderService.delete(id);
	}

	@PostMapping("/")
	public SalesOrderDTO add(SalesOrderDTO salesOrderDTO) {
		return salesOrderService.save(salesOrderDTO);
	}
	
	@ExceptionHandler(Throwable.class)
    public ResponseEntity<?> handleException(Throwable t)  {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
