package com.jsp.rm.daoimp;

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
	public Train save(Train trian) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train update(Train trian) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
