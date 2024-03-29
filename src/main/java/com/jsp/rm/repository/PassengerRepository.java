package com.jsp.rm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}

