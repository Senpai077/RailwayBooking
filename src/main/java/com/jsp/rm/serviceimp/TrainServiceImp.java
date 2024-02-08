package com.jsp.rm.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.dao.TrainDao;
import com.jsp.rm.entity.Train;
import com.jsp.rm.exception.DataNotFound;
import com.jsp.rm.exception.IdNotFound;
import com.jsp.rm.exception.UnableToCreated;
import com.jsp.rm.exception.UnableToUpdated;
import com.jsp.rm.service.TrainService;
import com.jsp.rm.util.ResponseStructure;

@Service
public class TrainServiceImp implements TrainService {

	@Autowired
	private TrainDao td;

	@Override
	public ResponseEntity<ResponseStructure<Train>> save(Train train) {

		Train savedTrain = td.save(train);
		if (savedTrain != null) {
			ResponseStructure<Train> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Train is saved successfully");
			structure.setData(td.save(savedTrain));

			return new ResponseEntity<ResponseStructure<Train>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToCreated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Train>> update(Train train) {
		Train savedTrain = td.save(train);
		if (savedTrain != null) {
			ResponseStructure<Train> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Train is Updated successfully");
			structure.setData(savedTrain);

			return new ResponseEntity<ResponseStructure<Train>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToUpdated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> delete(int id) {
		
		if (td.findById(id) != null) {
			td.delete(id);
			ResponseStructure<String> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Train is deleted successfully");
			structure.setData("No Content");

			return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.CREATED);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Train>> findTrainById(int id) {
		Optional<Train> train = td.findById(id);
		if (train.isPresent() ) {
			ResponseStructure<Train> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Train found");
			structure.setData(train.get());

			return new ResponseEntity<ResponseStructure<Train>>(structure, HttpStatus.FOUND);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Train>>> findAllTrain() {
		List<Train> trains = td.FindAll();
		if (trains != null) {
			ResponseStructure<List<Train>> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Trains found");
			structure.setData(trains);

			return new ResponseEntity<ResponseStructure<List<Train>>>(structure, HttpStatus.FOUND);
		} else {
			throw new DataNotFound();
		}
	}

}
