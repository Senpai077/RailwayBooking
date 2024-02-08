package com.jsp.rm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.rm.entity.Ticket;
import com.jsp.rm.service.TicketService;
import com.jsp.rm.util.ResponseStructure;


@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketService ts;   
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Ticket>> saveTicket(@RequestBody Ticket ticket){
		return  ts.save(ticket) ;
	}

	
	@PatchMapping("/update")
	public ResponseEntity<ResponseStructure<Ticket>> updatedTicket(@RequestBody Ticket ticket){
		return  ts.update(ticket) ;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<String>> deleteTicket(@RequestBody Ticket ticket){
		return  ts.delete(ticket.getId()) ;
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ResponseStructure<Ticket>> findTicket(@PathVariable int id){
		return  ts.findTicketById(id) ;
	}
	
	@GetMapping("/findall")
	public ResponseEntity<ResponseStructure<List<Ticket>>> findAllTicket(){
		return  ts.findAllTicket() ;
	}
	

}
