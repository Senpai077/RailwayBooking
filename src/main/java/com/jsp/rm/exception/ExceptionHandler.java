package com.jsp.rm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.rm.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotCreated.class)
	public ResponseEntity<ResponseStructure<String>> userNotCreated(UserNotCreated e){
		ResponseStructure<String> structure = new ResponseStructure<String>();	
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("User Creation is failed");
		structure.setData(null);
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_ACCEPTABLE);
	}
}
