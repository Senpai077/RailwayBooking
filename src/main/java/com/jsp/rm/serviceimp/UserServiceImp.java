package com.jsp.rm.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.dao.UserDao;
import com.jsp.rm.entity.User;
import com.jsp.rm.exception.UserNotCreated;
import com.jsp.rm.exception.UserNotUpdated;
import com.jsp.rm.service.UserService;
import com.jsp.rm.util.ResponseStructure;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao ud;

	@Override
	public ResponseEntity<ResponseStructure<User>> save(User user) {

		User savedUser = ud.save(user);
		if (savedUser != null) {
			ResponseStructure<User> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Student is saved successfully");
			structure.setData(ud.save(user));

			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
		} else {
			throw new UserNotCreated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> update(User user) {
		User savedUser = ud.save(user);
		if (savedUser == null) {
			ResponseStructure<User> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Student is Updated successfully");
			structure.setData(ud.save(user));

			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
		} else {
			throw new UserNotUpdated();
		}
	}

}
