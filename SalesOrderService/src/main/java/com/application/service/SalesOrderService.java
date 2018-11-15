package com.application.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.SalesOrderDTO;
import com.application.model.SalesOrder;
import com.application.repository.SalesOrderRepository;

@Service
public class SalesOrderService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private SalesOrderRepository salesOrderRepository;

	public List<SalesOrderDTO> getAllSOS() {
		return salesOrderRepository.findAll().stream().map(c -> modelMapper.map(c, SalesOrderDTO.class))
				.collect(Collectors.toList());
	}

	public SalesOrderDTO save(SalesOrderDTO salesOrderDTO) {
		SalesOrder salesOrder = salesOrderRepository.save(modelMapper.map(salesOrderDTO, SalesOrder.class));
		return modelMapper.map(salesOrder, SalesOrderDTO.class);
	}

	public SalesOrderDTO get(Long orderId) {
		return modelMapper.map(salesOrderRepository.findById(orderId), SalesOrderDTO.class);
	}

	public void delete(Long orderId) {
		salesOrderRepository.deleteById(orderId);
	}
}
