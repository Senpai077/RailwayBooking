package com.jsp.rm.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class Journey {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String startFrom;
	private String destination;
	private LocalDate date;
	private double price;
	
	@ManyToMany
	private List<Train> trains;
}
