package com.jsp.rm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer>{

}
