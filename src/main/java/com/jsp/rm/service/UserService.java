
package com.jsp.rm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.entity.User;
import com.jsp.rm.util.ResponseStructure;

@Service
public interface UserService {
	
	public ResponseEntity<ResponseStructure<User>> save(User user);
	public ResponseEntity<ResponseStructure<User>> update(User user);
	public ResponseEntity<ResponseStructure<String>> delete(int id);
	public ResponseEntity<ResponseStructure<User>> findUserById(int id);
	public ResponseEntity<ResponseStructure<List<User>>> findAllUser();
}
