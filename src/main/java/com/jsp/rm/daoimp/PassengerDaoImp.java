 package com.jsp.rm.daoimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.rm.dao.PassengerDao;
import com.jsp.rm.entity.Passenger;
import com.jsp.rm.repository.PassengerRepository;

@Repository
public class PassengerDaoImp implements PassengerDao {
	@Autowired
	PassengerRepository pr ;

	@Override
	public Passenger save(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger update(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
