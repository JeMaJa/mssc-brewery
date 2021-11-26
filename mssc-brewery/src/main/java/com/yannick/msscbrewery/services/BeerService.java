package com.yannick.msscbrewery.services;

import java.util.UUID;

import com.yannick.msscbrewery.web.model.BeerDto;

public interface BeerService {

	

	BeerDto getBeerById(UUID beerId);

}
