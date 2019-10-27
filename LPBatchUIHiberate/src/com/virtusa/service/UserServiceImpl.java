package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.dao.UserDAO;
import com.virtusa.dao.UserDAOImpl;
import com.virtusa.model.UserLogin;

public class UserServiceImpl implements UserService {

	UserDAO userDao=new UserDAOImpl();
	@Override
	public boolean userAuthenticationService(UserLogin userModel) {
		// TODO Auto-generated method stub
		
		boolean userValid = false;
		
		try {
			userValid = userDao.userAuth(userModel.getId(), userModel.getPassword());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return userValid;
		
	}
	
	

}
