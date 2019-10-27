package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.virtusa.dao.LpDAO;
import com.virtusa.dao.LpDAOImpl;
import com.virtusa.entities.BatchDetails;
import com.virtusa.entities.Lp;
import com.virtusa.entities.TrainingCalendar;
import com.virtusa.model.BatchModel;
import com.virtusa.model.CalendarModel;
import com.virtusa.model.LpModel;
import com.virtusa.model.UpdateLpDetailsModel;

public class LpServiceImpl implements LpService {

	LpDAO lpDao;

	public LpServiceImpl() {
lpDao=new LpDAOImpl();
	}

	@Override
	public List<LpModel> retrieveLpDetails(String userId) {
   System.out.println("ser"+userId);
		List<LpModel> lpModelList=new ArrayList<>();
		
		try {
			List<LpModel> lp = lpDao.lpProfileView(userId);
			for(LpModel lp2:lp) {
				LpModel lpModel=new LpModel();
				lpModel.setFirstName(lp2.getFirstName() );
				lpModel.setLastName(lp2.getLastName());
				lpModel.setEmail(lp2.getEmail());
				lpModel.setPhoneNumber(lp2.getPhoneNumber());
				lpModel.setRole(lp2.getRole()) ;
				lpModel.setCity("City:" + lp2.getCity() );
				lpModel.setState(lp2.getState());
				lpModel.setCountry(lp2.getCountry());
				lpModel.setId("ID:"+lp2.getId());
				lpModel.setBatchId("Batch ID:"+lp2.getBatchId());
				lpModelList.add(lpModel);
				String batchid=lp2.getBatchId();
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return lpModelList;

	
}
}