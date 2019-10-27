package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.TrainingCalendar;
import com.virtusa.model.LpModel;
import com.virtusa.model.MentorModel;
import com.virtusa.entities.BatchDetails;
import com.virtusa.entities.Lp;

public interface MentorDAO{
	

	List<MentorModel> mentorProfileView(String userId) throws ClassNotFoundException, SQLException;

	//List<BatchDetails> ViewBatchDetails(String username) throws ClassNotFoundException, SQLException;

	
}

