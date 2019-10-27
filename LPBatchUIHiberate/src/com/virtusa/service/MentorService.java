package com.virtusa.service;

import java.sql.SQLException;
import java.util.List;
import com.virtusa.model.BatchModel;
import com.virtusa.model.CalendarModel;
import com.virtusa.model.MentorModel;
import com.virtusa.model.UpdateMentorDetailsModel;

public interface MentorService {

	
	List<MentorModel> retrieveMentorDetails(String userId);
	
}
