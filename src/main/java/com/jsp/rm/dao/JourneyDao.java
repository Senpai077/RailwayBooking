package com.jsp.rm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Journey;

@Repository
public interface JourneyDao {

	Journey save(Journey journey);
	void delete(int id);
	Optional<Journey> findById(int id);
	List<Journey> FindAll();
}
