package com.jsp.rm.daoimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.rm.dao.UserDao;
import com.jsp.rm.entity.User;
import com.jsp.rm.repository.UserRepository;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	UserRepository ur;

	@Override
	public User save(User user) {
		return ur.save(user);
	}

	@Override
	public void delete(int id) {
		ur.deleteById(id);
		
	}

	@Override
	public Optional<User> findById(int id) {
		return ur.findById(id);
	}

	@Override
	public List<User> FindAll() {
		return ur.findAll();
	}

}
