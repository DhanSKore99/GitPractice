package com.cjc.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> CustomerNotFoundExceptionHandler(CustomerNotFoundException e ){
		
		System.out.println("sop statement added by dhanashri in exception handler class");
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
