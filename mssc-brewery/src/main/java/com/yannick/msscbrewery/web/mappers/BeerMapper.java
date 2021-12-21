package com.yannick.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import com.yannick.msscbrewery.domain.Beer;
import com.yannick.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {
	BeerDto beerToBeerDto(Beer beer);
	
	Beer beerDtoToBeer(BeerDto dto);

}
