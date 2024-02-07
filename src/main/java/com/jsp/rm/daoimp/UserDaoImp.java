package com.jsp.rm.daoimp;

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
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
