package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.TrainingCalendar;
import com.virtusa.model.LpModel;
import com.virtusa.entities.BatchDetails;
import com.virtusa.entities.Lp;

public interface LpDAO{
	
	
	//List<TrainingCalendar> viewTrainingCalendar(String userid) throws ClassNotFoundException, SQLException;

	//boolean storeLpDetails(Lp lp) throws ClassNotFoundException, SQLException;
	List<LpModel> lpProfileView(String userId) throws ClassNotFoundException, SQLException;

	//List<BatchDetails> ViewBatchDetails(String username) throws ClassNotFoundException, SQLException;

	
}
