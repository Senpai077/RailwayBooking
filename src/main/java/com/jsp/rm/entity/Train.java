package com.jsp.rm.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class Train {
	@Id
	private int id;
	private String name;
	private String classes;
	@ManyToMany 
	private List<Journey> jpurneys;

}
