package com.yannick.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yannick.msscbrewery.services.BeerService;
import com.yannick.msscbrewery.web.model.BeerDto;

//requestmapping creates the basis uri, everything else will be anotated

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	@Autowired
	private BeerService beerService;
	
	public BeerService getBeerService() {
		return beerService;
	}

	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
		
		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
		
	}

}
