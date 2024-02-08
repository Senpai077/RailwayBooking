package com.jsp.rm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.rm.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(UnableToCreated.class)
	public ResponseEntity<ResponseStructure<String>> userNotCreated(UnableToCreated e){
		ResponseStructure<String> structure = new ResponseStructure<String>();	
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("Creation is failed");
		structure.setData(e.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_ACCEPTABLE);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(UnableToUpdated.class)
	public ResponseEntity<ResponseStructure<String>> userNotCreated(UnableToUpdated e){
		ResponseStructure<String> structure = new ResponseStructure<String>();	
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("failed to update");
		structure.setData(e.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(IdNotFound.class)
	public ResponseEntity<ResponseStructure<String>> idNotFound(IdNotFound e){
		ResponseStructure<String> structure = new ResponseStructure<String>();	
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage("failed to get data with the given id");
		structure.setData(e.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(DataNotFound.class)
	public ResponseEntity<ResponseStructure<String>> DataNotFound(DataNotFound e){
		ResponseStructure<String> structure = new ResponseStructure<String>();	
		structure.setStatusCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage("Data Not Found");
		structure.setData(e.getMessage());
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
}
