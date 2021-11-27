package com.yannick.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yannick.msscbrewery.web.model.BeerDto;
import com.yannick.msscbrewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID id) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Jasper Tollenaere")
				.build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		log.debug("Deleting customer: "+customerId.toString());
	}

}
