package com.yannick.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import com.yannick.msscbrewery.domain.Customer;
import com.yannick.msscbrewery.web.model.CustomerDto;

@Mapper	
public interface CustomerMapper {
	CustomerDto customerToCustomerDto(Customer customer);
	Customer customerDtoToCustomer(CustomerDto dto);
}
