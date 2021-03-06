package com.yannick.msscbrewery.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yannick.msscbrewery.services.CustomerService;
import com.yannick.msscbrewery.web.model.CustomerDto;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerService getCustomerService() {
		return customerService;
	}
	
	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
		return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity handlePost(@Valid @RequestBody CustomerDto customerDto) {
		CustomerDto savedCust = customerService.saveCustomer(customerDto);
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Location", "/api/v1/customer/"+savedCust.getId().toString());
		
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@PutMapping({"/{customerId}"})
	public ResponseEntity handlePut(@PathVariable("customerId") UUID customerId,@RequestBody @Valid CustomerDto customerDto) {
		customerService.updateCustomer(customerId, customerDto);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		
	}
	@DeleteMapping({"/{customerId}"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void handleDelete(@PathVariable("customerId") UUID customerId) {
		customerService.deleteCustomer(customerId);
	}
 

}
/*
 * @PostMapping
	public ResponseEntity handlePost(@RequestBody BeerDto beerDto) {
		BeerDto beerSaved = beerService.SaveNewBeer(beerDto);
		HttpHeaders headers = new HttpHeaders();
		// to do, make full URL in the location
		headers.add("Location", "/api/v1/beer/"+beerSaved.getId().toString());
		
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@PutMapping({"/{beerId}"})
	public ResponseEntity handlePut(@PathVariable("beerId") UUID beerId,@RequestBody  BeerDto beerDto) {
		beerService.updateBeer(beerId, beerDto);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		
	}
	
	@DeleteMapping({"/{beerId}"})
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void handleDelete(@PathVariable("beerId") UUID beerId) {
		beerService.deleteBeer(beerId);
	}

 */

