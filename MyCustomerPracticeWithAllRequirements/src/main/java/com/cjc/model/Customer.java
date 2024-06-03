package com.cjc.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	@Size(min=4,max=15,message="Name must be minimum 4 characters")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@NotNull
	@Size(max=10,min=10,message="please enter valid mobile number")
	private String mobileNo;
	
	@Email(message="EmailId is invalid")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document doc;

}
