package com.jsp.rm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
