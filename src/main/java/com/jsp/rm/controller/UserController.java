package com.jsp.rm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.rm.entity.User;
import com.jsp.rm.service.UserService;
import com.jsp.rm.util.ResponseStructure;

@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	@PostMapping("/saveuser")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return  us.save(user) ;
	}

}
