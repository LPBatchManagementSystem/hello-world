package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.virtusa.entities.TrainingCalendar;
import com.virtusa.entities.BatchDetails;
import com.virtusa.entities.Mentor;
import com.virtusa.integrate.HibernateUtil;
import com.virtusa.model.MentorModel;

public class MentorDAOImpl implements MentorDAO {

	@Override
	public  List<MentorModel> mentorProfileView(String userId) throws ClassNotFoundException, SQLException {
		System.out.println("dao"+userId);
		
		HibernateUtil hibernateUtil=new HibernateUtil();
		SessionFactory sessFact = hibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		
		String queryString = "from MentorModel  where id = ?";
		Query query = session.createQuery(queryString);
		  query.setString(0, userId);
		 
		  List<MentorModel> resultSet=query.list();

	
       List<MentorModel>mentorList=new ArrayList<>();
       
       for(MentorModel mentor1:resultSet) {
    	MentorModel mentor=new MentorModel();
    	mentor.setFirstName(mentor1.getFirstName());
    	mentor.setLastName(mentor1.getLastName());
    	mentor.setEmail(mentor1.getEmail());
    	mentor.setPhoneNumber(mentor1.getPhoneNumber());
    	mentor.setRole(mentor1.getRole());
    	mentor.setCity(mentor1.getCity());
    	mentor.setState(mentor1.getState());
    	mentor.setCountry(mentor1.getCountry());
    	mentor.setId(mentor1.getId());
    	mentorList.add(mentor);
   		System.out.println(mentorList);

       }
       
       session.getTransaction().commit();
		
		return mentorList;

	}

}

