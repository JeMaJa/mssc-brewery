package com.yannick.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yannick.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID())
				.BeerName("Galaxy Cat")
				.beerStyle("IPA").build();
	}

}
 