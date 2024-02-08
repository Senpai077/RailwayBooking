package com.jsp.rm.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.rm.dao.UserDao;
import com.jsp.rm.entity.User;
import com.jsp.rm.exception.DataNotFound;
import com.jsp.rm.exception.IdNotFound;
import com.jsp.rm.exception.UnableToCreated;
import com.jsp.rm.exception.UnableToUpdated;
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
			structure.setMessage("User is saved successfully");
			structure.setData(ud.save(savedUser));

			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToCreated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> update(User user) {
		User savedUser = ud.save(user);
		if (savedUser != null) {
			ResponseStructure<User> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("User is Updated successfully");
			structure.setData(savedUser);

			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
		} else {
			throw new UnableToUpdated();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<String>> delete(int id) {
		
		if (ud.findById(id) != null) {
			ud.delete(id);
			ResponseStructure<String> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("User is deleted successfully");
			structure.setData("No Content");

			return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.CREATED);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> findUserById(int id) {
		Optional<User> user = ud.findById(id);
		if (user.isPresent()) {
			ResponseStructure<User> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("User found");
			structure.setData(user.get());

			return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.FOUND);
		} else {
			throw new IdNotFound();
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<User>>> findAllUser() {
		List<User> users = ud.FindAll();
		if (users != null) {
			ResponseStructure<List<User>> structure = new ResponseStructure<>();
			structure.setStatusCode(HttpStatus.FOUND.value());
			structure.setMessage("Users found");
			structure.setData(users);

			return new ResponseEntity<ResponseStructure<List<User>>>(structure, HttpStatus.FOUND);
		} else {
			throw new DataNotFound();
		}
	}

}
