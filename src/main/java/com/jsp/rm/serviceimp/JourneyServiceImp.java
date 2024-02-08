package com.jsp.rm.serviceimp;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.dao.JourneyDao;
import com.jsp.rm.entity.Journey;
import com.jsp.rm.exception.DataNotFound;
import com.jsp.rm.exception.IdNotFound;
import com.jsp.rm.exception.UnableToCreated;
import com.jsp.rm.exception.UnableToUpdated;
import com.jsp.rm.service.JourneyService;
import com.jsp.rm.util.ResponseStructure;

@Service
public class JourneyServiceImp implements JourneyService {

	@Autowired
	private JourneyDao jd;

	@Override
	public ResponseEntity<ResponseStructure<Journey>> save(Journey journey) {
		
		Journey savedJourney = jd.save(journey);
		
		if (savedJourney != null) {
			ResponseStructure<Journey> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Journey is saved successfully");
			structure.setData(savedJourney);

			return new ResponseEntity<ResponseStructure<Journey>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToCreated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Journey>> update(Journey journey) {
		Journey savedJourney = jd.save(journey);
		if (savedJourney != null) {
			ResponseStructure<Journey> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Journey is Updated successfully");
			structure.setData(savedJourney);

			return new ResponseEntity<ResponseStructure<Journey>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToUpdated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> delete(int id) {

		if (jd.findById(id) != null) {
			jd.delete(id);
			ResponseStructure<String> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Journey is deleted successfully");
			structure.setData("No Content");

			return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.CREATED);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Journey>> findJourneyById(int id) {
		Optional<Journey> journey = jd.findById(id);
		if (journey.isPresent()) {
			ResponseStructure<Journey> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Journey found");
			structure.setData(journey.get());

			return new ResponseEntity<ResponseStructure<Journey>>(structure, HttpStatus.FOUND);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Journey>>> findAllJourney() {
		List<Journey> journeys = jd.FindAll();
		if (journeys != null) {
			ResponseStructure<List<Journey>> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Journeys found");
			structure.setData(journeys);

			return new ResponseEntity<ResponseStructure<List<Journey>>>(structure, HttpStatus.FOUND);
		} else {
			throw new DataNotFound();
		}
	}

}
