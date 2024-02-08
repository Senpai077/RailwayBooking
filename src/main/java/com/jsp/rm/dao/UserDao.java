package com.jsp.rm.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.User;

@Repository
public interface UserDao {
	
	User save(User user);
	void delete(int id);
	Optional<User> findById(int id);
	List<User> FindAll();

}
