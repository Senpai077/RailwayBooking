package com.jsp.rm.dao;

import org.springframework.stereotype.Repository;

import com.jsp.rm.entity.User;

@Repository
public interface UserDao {
	
	User save(User user);
	User update(User user);
	User delete(int id);
	User findById(int id);
	User FindAll();

}
