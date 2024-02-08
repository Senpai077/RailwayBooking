package com.jsp.rm.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.dao.PassengerDao;
import com.jsp.rm.entity.Passenger;
import com.jsp.rm.exception.DataNotFound;
import com.jsp.rm.exception.IdNotFound;
import com.jsp.rm.exception.UnableToCreated;
import com.jsp.rm.exception.UnableToUpdated;
import com.jsp.rm.service.PassengerService;
import com.jsp.rm.util.ResponseStructure;

@Service
public class PassengerServiceImp implements PassengerService {

	@Autowired
	private PassengerDao pd;

	@Override
	public ResponseEntity<ResponseStructure<Passenger>> save(Passenger passenger) {

		Passenger savedPassenger = pd.save(passenger);
		if (savedPassenger != null) {
			ResponseStructure<Passenger> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Passenger is saved successfully");
			structure.setData(pd.save(savedPassenger));

			return new ResponseEntity<ResponseStructure<Passenger>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToCreated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Passenger>> update(Passenger passenger) {
		Passenger savedPassenger = pd.save(passenger);
		if (savedPassenger != null) {
			ResponseStructure<Passenger> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Passenger is Updated successfully");
			structure.setData(savedPassenger);

			return new ResponseEntity<ResponseStructure<Passenger>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToUpdated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> delete(int id) {
		
		if (pd.findById(id) != null) {
			pd.delete(id);
			ResponseStructure<String> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Passenger is deleted successfully");
			structure.setData("No Content");

			return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.CREATED);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Passenger>> findPassengerById(int id) {
		Optional<Passenger> passenger = pd.findById(id);
		if (passenger.isPresent()) {
			ResponseStructure<Passenger> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Passenger found");
			structure.setData(passenger.get());

			return new ResponseEntity<ResponseStructure<Passenger>>(structure, HttpStatus.FOUND);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Passenger>>> findAllPassenger() {
		List<Passenger> passengers = pd.FindAll();
		if (passengers != null) {
			ResponseStructure<List<Passenger>> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Passengers found");
			structure.setData(passengers);

			return new ResponseEntity<ResponseStructure<List<Passenger>>>(structure, HttpStatus.FOUND);
		} else {
			throw new DataNotFound();
		}
	}

}
