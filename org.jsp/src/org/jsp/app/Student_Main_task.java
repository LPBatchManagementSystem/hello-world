package org.jsp.app;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Student_Details
{
	static Scanner scanner = new Scanner(System.in);
	static Set<Student_Details> studentSet = new LinkedHashSet<Student_Details>();
	int student_Id;
	String student_Name;
	long student_Mobile_Number;
	String student_Department;
	public Student_Details(int student_Id, String student_Name, long number, String student_Department)
	{
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_Mobile_Number = number;
		this.student_Department = student_Department;
	}
	public String toString()
	{
		return "Student Details are student Id is " + student_Id + " with student Name " + student_Name
				+ "has a Mobile Number " + student_Mobile_Number + "and student Department is " + student_Department;
	}
	
	
}
