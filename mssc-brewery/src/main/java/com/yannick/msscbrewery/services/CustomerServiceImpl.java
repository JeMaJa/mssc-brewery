package com.yannick.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yannick.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID id) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Jasper Tollenaere")
				.build();
	}

}
