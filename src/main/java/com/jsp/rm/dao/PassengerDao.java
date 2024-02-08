package com.jsp.rm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Passenger;

@Repository
public interface PassengerDao {

	Passenger save(Passenger passenger);
	void delete(int id);
	Optional<Passenger> findById(int id);
	List<Passenger> FindAll();
}
