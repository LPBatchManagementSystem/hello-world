
package com.virtusa.controller;

import java.util.List;

import com.virtusa.helper.FactoryStudentService;
import com.virtusa.model.StudentModel;
import com.virtusa.service.StudentService;
import com.virtusa.view.StudentView;

public class StudentController {
	private StudentService studentService;
	public StudentController(){
		this.studentService=FactoryStudentService.createStudentService();
		
	}
	
	public void storeStudent(StudentModel studentModel){
		
		boolean result=studentService.storeStudentService(studentModel);
		StudentView studentView=new StudentView();
		if(result){
			studentView.storeSuccessful();
		}else{
			
			studentView.storeUnSuccessful();
		}
		
	}
	

	public void viewStudent(){
		
		List<StudentModel> studentModelList=studentService.retrieveStudentService();
		StudentView studentView=new StudentView();
		studentView.displayStudentDetails(studentModelList);
	}
}

