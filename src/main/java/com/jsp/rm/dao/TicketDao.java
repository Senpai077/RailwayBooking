package com.jsp.rm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Ticket;

@Repository
public interface TicketDao {

	Ticket save(Ticket ticket);
	void delete(int id);
	Optional<Ticket> findById(int id);
	List<Ticket> FindAll();
}
