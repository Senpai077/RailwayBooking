package com.jsp.rm.dao;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Train;

@Repository
public interface TrainDao {

	Train save(Train trian);
	Train update(Train trian);
	Train delete(int id);
	Train findById(int id);
	Train FindAll();
}
