
package com.virtusa.dao;

import java.util.List;

import com.virtusa.entity.Student;

public class MemoryStudentDAOImpl implements StudentDAO {

	@Override
	public boolean persistStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.add(student);
		
	}

	@Override
	public List<Student> viewStudents() {
		// TODO Auto-generated method stub
		return StudentRepository.get();
	}

}
