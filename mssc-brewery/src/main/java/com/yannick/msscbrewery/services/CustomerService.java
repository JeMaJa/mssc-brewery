package com.yannick.msscbrewery.services;

import java.util.UUID;

import com.yannick.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID id);

	CustomerDto saveCustomer(CustomerDto customerDto);

	void updateCustomer(UUID customerId, CustomerDto customerDto);

	void deleteCustomer(UUID customerId);

}
