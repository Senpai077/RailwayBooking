
package com.jsp.rm.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private long phoneNumber;
}
