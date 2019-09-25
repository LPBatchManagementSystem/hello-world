package com.virtusa.service;

import java.util.List;

import com.virtusa.model.StudentModel;

public interface StudentService {
	
	public boolean storeStudentService(StudentModel studentmodel);
	public List<StudentModel> retrieveStudentService();

}
