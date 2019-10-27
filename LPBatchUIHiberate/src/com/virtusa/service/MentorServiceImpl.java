package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.virtusa.dao.MentorDAO;
import com.virtusa.dao.MentorDAOImpl;
import com.virtusa.entities.BatchDetails;
import com.virtusa.entities.Mentor;
import com.virtusa.entities.TrainingCalendar;
import com.virtusa.model.BatchModel;
import com.virtusa.model.CalendarModel;
import com.virtusa.model.MentorModel;
import com.virtusa.model.UpdateMentorDetailsModel;

public class MentorServiceImpl implements MentorService {

	MentorDAO mentorDao;

	public MentorServiceImpl() {
mentorDao=new MentorDAOImpl();
	}

	@Override
	public List<MentorModel> retrieveMentorDetails(String userId) {
   System.out.println("ser"+userId);
		List<MentorModel> mentorModelList=new ArrayList<>();
		
		try {
			List<MentorModel> mentor = mentorDao.mentorProfileView(userId);
			for(MentorModel mentor2:mentor) {
				MentorModel mentorModel=new MentorModel();
				mentorModel.setFirstName(mentor2.getFirstName() );
				mentorModel.setLastName(mentor2.getLastName());
				mentorModel.setEmail(mentor2.getEmail());
				mentorModel.setPhoneNumber(mentor2.getPhoneNumber());
				mentorModel.setRole(mentor2.getRole()) ;
				mentorModel.setCity("City:" + mentor2.getCity() );
				mentorModel.setState(mentor2.getState());
				mentorModel.setCountry(mentor2.getCountry());
				mentorModel.setId("ID:"+mentor2.getId());
				mentorModel.setBatchId("Batch ID:"+mentor2.getBatchId());
				mentorModelList.add(mentorModel);
				String batchid=mentor2.getBatchId();
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return mentorModelList;

	
}
}