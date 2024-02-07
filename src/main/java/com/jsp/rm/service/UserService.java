
package com.jsp.rm.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.entity.User;
import com.jsp.rm.util.ResponseStructure;

@Service
public interface UserService {
	
	public ResponseEntity<ResponseStructure<User>> save(User user);
	public ResponseEntity<ResponseStructure<User>> update(User user);
}
