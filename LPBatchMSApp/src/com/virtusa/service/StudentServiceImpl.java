package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.StudentDAO;
import com.virtusa.entity.Course;
import com.virtusa.entity.Student;
import com.virtusa.entity.StudentDetails;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.StudentModel;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO=null;
	public StudentServiceImpl(){
		this.studentDAO=FactoryStudentDAO.createStudentDAO();
		
	}
	
	
	@Override
	public boolean storeStudentService(StudentModel studentmodel) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		student.setRollNo(studentmodel.getRollNo());
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setFirstName(studentmodel.getFirstName());
		studentDetails.setLastName(studentmodel.getLastName());
		studentDetails.setStudentDetailsId(1);
		studentDetails.setEmail(studentmodel.getEmail());
		studentDetails.setPhoneNumber(studentmodel.getPhoneNumber());
		
		Course course=new Course();
		course.setCourseId(studentmodel.getCourseId());
		
		student.setCourse(course);
		
		return studentDAO.persistStudent(student);
	}

	@Override
	public List<StudentModel> retrieveStudentService() {
		// TODO Auto-generated method stub
		List<Student> studentList=studentDAO.viewStudents();
		
		StudentModel studentModel=new StudentModel();
		List<StudentModel> studentModelList=new ArrayList<StudentModel>();
		
		for(Student student:studentList){
			
			StudentModel studentMdl=new StudentModel();
			studentMdl.setRollNo(student.getRollNo());
			studentMdl.setCourseId(student.getCourse().getCourseId());
			studentMdl.setFirstName(student.getStudentDetails().getFirstName());
			studentMdl.setLastName(student.getStudentDetails().getLastName());
			studentMdl.setEmail(student.getStudentDetails().getEmail());
			studentMdl.setPhoneNumber(student.getStudentDetails().getEmail());
			studentModelList.add(studentMdl);
		}
		return studentModelList;
	}

}
