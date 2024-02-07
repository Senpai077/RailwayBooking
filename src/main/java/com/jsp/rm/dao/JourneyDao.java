package com.jsp.rm.dao;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Journey;

@Repository
public interface JourneyDao {

	Journey save(Journey journey);
	Journey update(Journey journey);
	Journey delete(int id);
	Journey findById(int id);
	Journey FindAll();
}
