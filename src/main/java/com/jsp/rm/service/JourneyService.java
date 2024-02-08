package com.jsp.rm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.rm.entity.Journey;
import com.jsp.rm.util.ResponseStructure;

public interface JourneyService {

	public ResponseEntity<ResponseStructure<Journey>> save(Journey jser) ;

	public ResponseEntity<ResponseStructure<Journey>> update(Journey jser) ;

	public ResponseEntity<ResponseStructure<String>> delete(int id) ;

	public ResponseEntity<ResponseStructure<Journey>> findJourneyById(int id) ;

	public ResponseEntity<ResponseStructure<List<Journey>>> findAllJourney() ;

}
