package com.jsp.rm.daoimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.rm.dao.TicketDao;
import com.jsp.rm.entity.Ticket;
import com.jsp.rm.repository.TicketRepository;

@Repository
public class TicketDaoImp implements TicketDao{
	@Autowired
	TicketRepository tr;

	@Override
	public Ticket save(Ticket ticket) {
		return tr.save(ticket);
	}

	@Override
	public Ticket update(Ticket ticket) {
		return tr.save(ticket);
	}

	@Override
	public void delete(int id) {
		 tr.deleteById(id);;
	}

	@Override
	public Optional<Ticket> findById(int id) {
		return tr.findById(id);
	}

	@Override
	public Ticket FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
