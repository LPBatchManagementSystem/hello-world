package org.jsp.app;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Faculty_Main_Task 
{
	static Set<Student_Details> studentSet = new LinkedHashSet<Student_Details>();
	static Scanner scanner = new Scanner(System.in);
	static int id1;
	static String name1;
	static long number1;
	static String department1;
	
	public void adding_of_Student_Details()
	{
		System.out.println("Enter the Student ID");
		int id=scanner.nextInt();
		id1=id;
		System.out.println("Enter the Student Name");
		String name=scanner.next();
		name1=name;
		System.out.println("Enter the Student Mobile Number");
		long number=scanner.nextLong();
		number1=number;
		System.out.println("Enter the Student Department");
		String department=scanner.next();
		department1=department;
		Student_Details studentdetails=new Student_Details(id, name, number, department);
		studentSet.add(studentdetails);
		
		System.out.println("Enter 1 to Print the Given data");
		System.out.println("Enter 2 for MAIN MENU");
		System.out.println("Enter 3 for HOME PAGE");
		int choice=scanner.nextInt();
		
		switch(choice)
		{
			case 1:System.out.println(studentSet);
				System.out.println("Enter 1 for MAIN MENU");
				System.out.println("Enter 2 for HOME PAGE");
				int choice1=scanner.nextInt();
				switch(choice1)
				{
					case 1:Student_Main_task student_Main_task=new Student_Main_task();
						student_Main_task.student_Main_Task();
						break;
					case 2:Main_Class.main(null);
						break;
					default:System.out.println("Enter Choice Is Invalid Please Check It and Try Again");
				}
					break;
			case 2:Student_Main_task student_Main_task=new Student_Main_task();
					student_Main_task.student_Main_Task();
					break;
			case 3:Main_Class.main(null);
					break;
			default:System.out.println("Enter Choice Is Invalid Please Check It and Try Again");
		}
		
	}
	public void search_Student()
	{
		System.out.println("Enter Student Id to search : ");
		int id = scanner.nextInt();
		Iterator<Student_Details> iterator = studentSet.iterator();
		while(iterator.hasNext())
		{
			Student_Details student_Details = (Student_Details)iterator.next();
			if(student_Details.student_Id==id)
			{
				System.out.println("Student Details are Found......");
				System.out.println(student_Details);
			}
			else
			{
				System.out.println("Invalid Student ID");
			}			
		}
		System.out.println("Enter 1 for MAIN MENU");
		System.out.println("Enter 2 for HOME PAGE");
		int choice=scanner.nextInt();
		switch(choice)
		{
			case 1:Student_Main_task student_Main_task=new Student_Main_task();
					student_Main_task.student_Main_Task();
					break;
			case 2:Main_Class.main(null);
					break;
			default:System.out.println("Enter Choice Is Invalid Please Check It and Try Again");
		}
	}
	
	public void remove_Student()
	{
		System.out.println("Enter Student Id to remove");
		int id =scanner.nextInt();
		Iterator<Student_Details> iterator=studentSet.iterator();
		while(iterator.hasNext())
		{
			Student_Details student_Details = (Student_Details)iterator.next();
			if(student_Details.student_Id==id)
			{
				studentSet.remove(student_Details);
				System.out.println("Student Details are removed.....");
			}
		}
		System.out.println("Enter 1 for MAIN MENU");
		System.out.println("Enter 2 for HOME PAGE");
		int choice=scanner.nextInt();
		switch(choice)
		{
			case 1:Student_Main_task student_Main_task=new Student_Main_task();
					student_Main_task.student_Main_Task();
					break;
			case 2:Main_Class.main(null);
					break;
			default:System.out.println("Enter Choice Is Invalid Please Check It and Try Again");
		}scanner.close();
	}
}
