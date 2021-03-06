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

import com.application.dto.ItemDTO;
import com.application.service.ItemService;

@RestController
@RequestMapping("/items")
@RestControllerAdvice
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/")
	public List<ItemDTO> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/{itemName}")
	public ItemDTO get(String itemName){
		return itemService.get(itemName);
	}
	@DeleteMapping
	public void delete(Long id){
		itemService.delete(id);
	}
	
	@PostMapping("/")
	public ItemDTO add(ItemDTO itemDTO) {
		return itemService.save(itemDTO);
	}
 
	@PutMapping("/{id}")
	public ItemDTO update(Long id,ItemDTO itemDTO) {
		itemDTO.setId(id);
		return itemService.save(itemDTO);
	}
	
	@ExceptionHandler(Throwable.class)
    public ResponseEntity<?> handleException(Throwable t)  {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
