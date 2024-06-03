package com.cjc.controller;


import java.io.IOException;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;
import com.cjc.model.Customer;
import com.cjc.model.Document;
import com.cjc.servicei.CustomerServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerServiceI csi;
	
	Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@PostMapping(value="/saveCustomer",consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	public ResponseEntity<String> saveCustomer( @RequestPart("pancard")MultipartFile id,
											@RequestPart("jsondata") String json)throws IOException{
		
		ObjectMapper om = new ObjectMapper();
		Customer cu = om.readValue(json, Customer.class);
		Document d = cu.getDoc();
		d.setPancard(id.getBytes());
		
		cu.setDoc(d);
		 csi.saveCustomer(cu);
		 log.info("New Customer details saved into database");
		 System.out.println("Statement added today for practice");
		 return new ResponseEntity<String>("Customer saved..",HttpStatus.CREATED);
		
	}
	
	/*
	 * @PostMapping("/saveCustomer") public ResponseEntity<String>
	 * saveCustomer( @Valid @RequestBody Customer c){ csi.saveCustomer(c);
	 * log.info("New Customer details saved into database"); return new
	 * ResponseEntity<String>("Customer saved..",HttpStatus.CREATED);
	 * 
	 * }
	 */
	

}
