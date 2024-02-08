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

import com.jsp.rm.entity.Train;
import com.jsp.rm.service.TrainService;
import com.jsp.rm.util.ResponseStructure;


@RestController
@RequestMapping("/train")
public class TrainController {
	
	@Autowired
	TrainService ts;   
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Train>> saveTrain(@RequestBody Train train){
		return  ts.save(train) ;
	}

	
	@PatchMapping("/update")
	public ResponseEntity<ResponseStructure<Train>> updatedTrain(@RequestBody Train train){
		return  ts.update(train) ;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<String>> deleteTrain(@RequestBody Train train){
		return  ts.delete(train.getId()) ;
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ResponseStructure<Train>> findTrain(@PathVariable int id){
		return  ts.findTrainById(id) ;
	}
	
	@GetMapping("/findall")
	public ResponseEntity<ResponseStructure<List<Train>>> findAllTrain(){
		return  ts.findAllTrain() ;
	}
	

}
