package com.jsp.rm.daoimp;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Journey update(Journey journey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Journey delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Journey findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Journey FindAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
