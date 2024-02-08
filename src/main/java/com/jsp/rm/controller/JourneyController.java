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

import com.jsp.rm.entity.Journey;
import com.jsp.rm.service.JourneyService;
import com.jsp.rm.util.ResponseStructure;


@RestController
@RequestMapping("/journey")
public class JourneyController {
	
	@Autowired
	JourneyService js;   
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Journey>> saveJourney(@RequestBody Journey journey){
		return  js.save(journey) ;
	}

	
	@PatchMapping("/update")
	public ResponseEntity<ResponseStructure<Journey>> updatedJourney(@RequestBody Journey journey){
		return  js.update(journey) ;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<String>> deleteJourney(@RequestBody Journey journey){
		return  js.delete(journey.getId()) ;
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ResponseStructure<Journey>> findJourney(@PathVariable int id){
		return  js.findJourneyById(id) ;
	}
	
	@GetMapping("/findall")
	public ResponseEntity<ResponseStructure<List<Journey>>> findAllJourney(){
		return  js.findAllJourney() ;
	}
	

}
