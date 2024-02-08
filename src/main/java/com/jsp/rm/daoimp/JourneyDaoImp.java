package com.jsp.rm.daoimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.rm.dao.JourneyDao;
import com.jsp.rm.entity.Journey;
import com.jsp.rm.repository.JourneyRepository;

@Repository
public class JourneyDaoImp  implements JourneyDao{
	@Autowired
	JourneyRepository jr;

	@Override
	public Journey save(Journey journey) {
		return jr.save(journey);
	}

	@Override
	public void delete(int id) {
		jr.deleteById(id);
	}

	@Override
	public Optional<Journey> findById(int id) {
		return jr.findById(id);
	}

	@Override
	public List<Journey> FindAll() {
		return jr.findAll();
	}
	
	

}
