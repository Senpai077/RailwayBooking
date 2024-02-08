package com.jsp.rm.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.dao.TicketDao;
import com.jsp.rm.entity.Ticket;
import com.jsp.rm.exception.DataNotFound;
import com.jsp.rm.exception.IdNotFound;
import com.jsp.rm.exception.UnableToCreated;
import com.jsp.rm.exception.UnableToUpdated;
import com.jsp.rm.service.TicketService;
import com.jsp.rm.util.ResponseStructure;

@Service
public class TicketServiceImp implements TicketService {

	@Autowired
	private TicketDao td;

	@Override
	public ResponseEntity<ResponseStructure<Ticket>> save(Ticket ticket) {

		Ticket savedTicket = td.save(ticket);
		if (savedTicket != null) {
			ResponseStructure<Ticket> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Ticket is saved successfully");
			structure.setData(td.save(savedTicket));

			return new ResponseEntity<ResponseStructure<Ticket>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToCreated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Ticket>> update(Ticket ticket) {
		Ticket savedTicket = td.save(ticket);
		if (savedTicket != null) {
			ResponseStructure<Ticket> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Ticket is Updated successfully");
			structure.setData(savedTicket);

			return new ResponseEntity<ResponseStructure<Ticket>>(structure, HttpStatus.CREATED);
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
			structure.setMessage("Ticket is deleted successfully");
			structure.setData("No Content");

			return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.CREATED);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<Ticket>> findTicketById(int id) {
		Optional<Ticket> ticket = td.findById(id);
		if (ticket.isPresent()) {
			ResponseStructure<Ticket> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Ticket found");
			structure.setData(ticket.get());

			return new ResponseEntity<ResponseStructure<Ticket>>(structure, HttpStatus.FOUND);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Ticket>>> findAllTicket() {
		List<Ticket> tickets = td.FindAll();
		if (tickets != null) {
			ResponseStructure<List<Ticket>> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Tickets found");
			structure.setData(tickets);

			return new ResponseEntity<ResponseStructure<List<Ticket>>>(structure, HttpStatus.FOUND);
		} else {
			throw new DataNotFound();
		}
	}

}
