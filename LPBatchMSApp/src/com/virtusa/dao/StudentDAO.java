package com.virtusa.dao;

import java.util.List;

import com.virtusa.entity.Student;

public interface StudentDAO {
	
	public boolean persistStudent(Student student);
	public List<Student> viewStudents();

}
