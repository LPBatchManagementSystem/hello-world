package com.virtusa.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.virtusa.integrate.HibernateUtil;
import com.virtusa.model.UserLogin;


public class UserDAOImpl implements UserDAO {

	@Override
	public boolean userAuth(int id, String password) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		HibernateUtil hibernateUtil=new HibernateUtil();
		 System.out.println(id);

		boolean result=false;
		SessionFactory sessFact = hibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		
		String queryString = "from UserLogin  where id = ? and password= ?";
		Query query = session.createQuery(queryString);
		  query.setInteger(0,id);
		  query.setString(1, password);
		
		 //int a= (int) query.uniqueResult();
		 List<UserLogin> userlist= query.list();
		for( UserLogin login1: userlist) {
			
			UserLogin login=new UserLogin();
			login.setId(login1.getId());
			login.setPassword(login1.getPassword());
			result=true;
		}
		  
		 
		  session.getTransaction().commit();
		return result;
		
		
	}
	}


