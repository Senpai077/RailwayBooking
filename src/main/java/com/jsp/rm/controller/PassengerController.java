package com.jsp.rm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.rm.entity.Passenger;
import com.jsp.rm.service.PassengerService;
import com.jsp.rm.util.ResponseStructure;


@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	PassengerService ps;   
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Passenger>> savePassenger(@RequestBody Passenger passenger){
		return  ps.save(passenger) ;
	}

	
	@PatchMapping("/update")
	public ResponseEntity<ResponseStructure<Passenger>> updatedPassenger(@RequestBody Passenger passenger){
		return  ps.update(passenger) ;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<String>> deletePassenger(@RequestBody Passenger passenger){
		return  ps.delete(passenger.getId()) ;
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ResponseStructure<Passenger>> findPassenger(@PathVariable int id){
		return  ps.findPassengerById(id) ;
	}
	
	@GetMapping("/findall")
	public ResponseEntity<ResponseStructure<List<Passenger>>> findAllPassenger(){
		return  ps.findAllPassenger() ;
	}
	

}
