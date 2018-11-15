package com.application.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.ItemDTO;
import com.application.model.Item;
import com.application.repository.ItemRepository;

@Transactional
@Service
public class ItemService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ItemRepository itemRepository;

	public List<ItemDTO> getAllItems() {
		return itemRepository.findAll().stream().map(c -> modelMapper.map(c, ItemDTO.class))
				.collect(Collectors.toList());
	}

	public ItemDTO get(String itemName) {
		return modelMapper.map(itemRepository.findByName(itemName), ItemDTO.class);
	}

	public void delete(Long id) {
		itemRepository.deleteById(id);
	}

	public ItemDTO save(ItemDTO itemDTO) {
		Item item = itemRepository.save(modelMapper.map(itemDTO, Item.class));
		return modelMapper.map(item, ItemDTO.class);
	}

}
