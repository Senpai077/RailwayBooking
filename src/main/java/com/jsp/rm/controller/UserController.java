package com.jsp.rm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.rm.entity.User;
import com.jsp.rm.service.UserService;
import com.jsp.rm.util.ResponseStructure;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService us;   
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return  us.save(user) ;
	}

	
	@PatchMapping("/update")
	public ResponseEntity<ResponseStructure<User>> updatedUser(@RequestBody User user){
		return  us.update(user) ;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<String>> deleteUser(@RequestBody User user){
		return  us.delete(user.getId()) ;
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<ResponseStructure<User>> findUser(@PathVariable int id){
		return  us.findUserById(id) ;
	}
	
	@GetMapping("/findall")
	public ResponseEntity<ResponseStructure<List<User>>> findAllUser(){
		return  us.findAllUser() ;
	}
	

}
