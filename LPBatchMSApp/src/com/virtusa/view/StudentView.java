package com.virtusa.view;
import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.StudentController;
import com.virtusa.model.StudentModel;

public class StudentView {
	public void registerStudentForm(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Student Roll No");
		int rollNo=scanner.nextInt();
		
		System.out.print("Student FirstName:");
		String firstName=scanner.next();
		
		System.out.print("Student LastName:");
		String lastName=scanner.next();
		
		System.out.print("Student Email:");
		String email=scanner.next();
		

		System.out.print("Student PhoneNumber:");
		String phoneNumber=scanner.next();
		
		
		System.out.print("Course Id:");
		int courseId=scanner.nextInt();
		
		StudentModel studentModel=new StudentModel();
		studentModel.setCourseId(courseId);
		studentModel.setEmail(email);
		studentModel.setFirstName(firstName);
		studentModel.setLastName(lastName);
		studentModel.setRollNo(rollNo);
		studentModel.setPhoneNumber(phoneNumber);
		
		StudentController studentController=new StudentController();
		studentController.storeStudent(studentModel);
		
	}
	
	
	public void storeSuccessful(){
		
		System.out.println("Student registered successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Student registered unsuccessful");
	}
    
    
    
    public void displayStudentDetails(List<StudentModel> studentModel){
    	
    	studentModel.forEach(System.out::println);
    }


}
