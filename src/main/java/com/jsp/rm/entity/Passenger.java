package com.jsp.rm.entity;

import org.springframework.stereotype.Component;

import com.jsp.rm.util.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class Passenger {
	@Id
	private int id;
	private String name;
	private int age;
	private Gender gender;
	private long phoneNumber;
}
