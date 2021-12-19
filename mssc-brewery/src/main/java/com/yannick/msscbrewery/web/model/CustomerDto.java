package com.yannick.msscbrewery.web.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Validated
public class CustomerDto {
	@Null
	private UUID id;
	@NotNull
	@NotBlank
	@Size(min=3, max=100)
	private String name;
	
}
