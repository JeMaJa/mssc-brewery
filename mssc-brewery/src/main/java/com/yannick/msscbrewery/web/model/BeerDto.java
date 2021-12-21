package com.yannick.msscbrewery.web.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * data creates getters and setters
 * 
 * Builder makes a builder patern, what that may be...
 * 
 * Now i don't have to create these things myself!!!
 */

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	@Null
	private UUID id;
	@NotBlank
	private String beerName;
	@NotBlank
	private String beerStyle;
	@Positive
	private long upc;

}
