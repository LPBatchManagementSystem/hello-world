package com.virtusa.helper;

import com.virtusa.dao.MemoryStudentDAOImpl;
import com.virtusa.dao.StudentDAO;

public class FactoryStudentDAO {
public static StudentDAO createStudentDAO(){
		
		StudentDAO studentDAO=new MemoryStudentDAOImpl();
		return studentDAO;
		
	}

}
