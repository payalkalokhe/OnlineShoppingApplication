package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

	public Item findByName(String itemName);
}
