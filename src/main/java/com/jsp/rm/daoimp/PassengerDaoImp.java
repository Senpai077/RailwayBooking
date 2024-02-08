 package com.jsp.rm.daoimp;

import java.util.List;
import java.util.Optional;

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
		return pr.save(passenger);
	}


	@Override
	public void delete(int id) {
		pr.deleteById(id);
	}

	@Override
	public Optional<Passenger> findById(int id) {
		return pr.findById(id);
	}

	@Override
	public List<Passenger> FindAll() {
		return pr.findAll();
	}

}
