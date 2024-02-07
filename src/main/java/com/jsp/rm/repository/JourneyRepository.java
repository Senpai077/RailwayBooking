package com.jsp.rm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Journey;

@Repository
public interface JourneyRepository extends JpaRepository<Journey, Integer> {

}
