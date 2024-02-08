package com.jsp.rm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.rm.entity.Passenger;
import com.jsp.rm.util.ResponseStructure;

public interface PassengerService {

	ResponseEntity<ResponseStructure<Passenger>> save(Passenger passenger);

	ResponseEntity<ResponseStructure<Passenger>> update(Passenger passenger);

	ResponseEntity<ResponseStructure<String>> delete(int id);

	ResponseEntity<ResponseStructure<Passenger>> findPassengerById(int id);

	ResponseEntity<ResponseStructure<List<Passenger>>> findAllPassenger();

}
