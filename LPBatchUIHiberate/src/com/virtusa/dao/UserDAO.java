package com.virtusa.dao;

import java.sql.SQLException;

public interface UserDAO {
	
	//public boolean userAuth(String userId,String password) throws SQLException, ClassNotFoundException;

	boolean userAuth(int userId, String password) throws SQLException, ClassNotFoundException;

}
