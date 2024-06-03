package com.cjc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addrId;
	@NotNull
	private String areaName;
	
	@NotNull(message="city name is required")
	private String cityName;
	
	@NotNull(message="please enter valid pincode")
	private String pincode;
	
	@NotNull(message="state name is required")
	private String state;
	
	@NotNull(message="this field is required")
	private String country;
	

}
