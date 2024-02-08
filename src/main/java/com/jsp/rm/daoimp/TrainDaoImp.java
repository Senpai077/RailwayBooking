package com.jsp.rm.daoimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.rm.dao.TrainDao;
import com.jsp.rm.entity.Train;
import com.jsp.rm.repository.TrainRepository;

@Repository
public class TrainDaoImp implements TrainDao {
	@Autowired
	TrainRepository tr;

	@Override
	public Train save(Train train) {
		return tr.save(train);
	}

	
	@Override
	public void delete(int id) {
		tr.deleteById(id);
	}

	@Override
	public Optional<Train> findById(int id) {
		return tr.findById(id);
	}

	@Override
	public List<Train> FindAll() {
		return tr.findAll();
	}

}
