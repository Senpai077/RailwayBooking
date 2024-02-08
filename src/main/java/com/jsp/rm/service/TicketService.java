package com.jsp.rm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.rm.entity.Ticket;
import com.jsp.rm.util.ResponseStructure;

public interface TicketService {

	ResponseEntity<ResponseStructure<Ticket>> save(Ticket ticket);

	ResponseEntity<ResponseStructure<Ticket>> update(Ticket ticket);

	ResponseEntity<ResponseStructure<String>> delete(int id);

	ResponseEntity<ResponseStructure<Ticket>> findTicketById(int id);

	ResponseEntity<ResponseStructure<List<Ticket>>> findAllTicket();

}
