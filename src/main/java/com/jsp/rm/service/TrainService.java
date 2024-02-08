package com.jsp.rm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.rm.entity.Train;
import com.jsp.rm.util.ResponseStructure;

public interface TrainService {

	ResponseEntity<ResponseStructure<Train>> save(Train tser);

	ResponseEntity<ResponseStructure<Train>> update(Train tser);

	ResponseEntity<ResponseStructure<String>> delete(int id);

	ResponseEntity<ResponseStructure<Train>> findTrainById(int id);

	ResponseEntity<ResponseStructure<List<Train>>> findAllTrain();

}
