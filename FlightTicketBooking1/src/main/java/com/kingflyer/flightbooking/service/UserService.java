package com.kingflyer.flightbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.Repo.UserRepo;
import com.kingflyer.flightbooking.entity.User;

@Service
@Transactional
public class UserService {
	private static final String USER_NOT_FOUND="User Not Found";

	@Autowired
	private UserRepo userDao;

	public boolean addUser(User user) throws Exception {

		Optional<User> checkUser = userDao.findById(user.getId());
		if (!checkUser.isPresent()) {
			userDao.save(user);
			return true;
		}

		else
			throw new Exception("User with Id:" + user.getId() + " Already Exist");
	}

	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public String checkLogin(String email, String password) {
		// TODO Auto-generated method stub
		return "False";
	}

	public void checkLoginByemailandpassword() {
		// TODO Auto-generated method stub
		
	}
	

}
