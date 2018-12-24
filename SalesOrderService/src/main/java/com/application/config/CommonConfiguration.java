package com.application.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.dto.OrderLineItemDTO;
import com.application.messagelistener.CustomerMessageListener;
import com.application.messagelistener.CustomerMessageListener.Customer;
import com.application.model.OrderLineItem;

@Configuration
public class CommonConfiguration {
		
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.createTypeMap(OrderLineItem.class, OrderLineItemDTO.class);
		modelMapper.createTypeMap(OrderLineItemDTO.class, OrderLineItem.class);
		TypeMap<com.application.messagelistener.CustomerMessageListener.Customer, Customer> typeMap = modelMapper
				.createTypeMap(com.application.messagelistener.CustomerMessageListener.Customer.class, Customer.class);
		typeMap.addMappings(new PropertyMap<CustomerMessageListener.Customer, Customer>() {

			@Override
			protected void configure() {
				map().setEmail(source.getEmail());
				map().setId(source.getId());
				map().setFirstName(source.getFirstName());
				map().setLastName(source.getLastName());
			}
		});
		return modelMapper;
	}
	
}