package com.jsp.rm.dao;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Passenger;

@Repository
public interface PassengerDao {

	Passenger save(Passenger passenger);
	Passenger update(Passenger passenger);
	Passenger delete(int id);
	Passenger findById(int id);
	Passenger FindAll();
}
