package com.jsp.rm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Train;

@Repository
public interface TrainDao {

	Train save(Train trian);
	void delete(int id);
	Optional<Train> findById(int id);
	List<Train> FindAll();
}
