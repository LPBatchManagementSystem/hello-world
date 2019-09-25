package org.jsp.app;

import java.util.Scanner;

public class Main_Class 
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		{
			System.out.println("Enter 1 for Student Tasks");
			System.out.println("Enter 2 for Faculty Tasks ");
			System.out.println("Enter 3 for Administration");
			int choice =scanner.nextInt();
			
			switch (choice)
			{		
				case 1:Student_Main_task student_Main_task=new Student_Main_task();
				       student_Main_task.student_Main_Task();
					   break;
				case 2:Faculty_Main_Task faculty_Main_Task=new Faculty_Main_Task();
						faculty_Main_Task.faculty_Main_Task();
						break;
				case 3:Administration_main administration_main=new Administration_main();
						administration_main.administration_Main();
						break;
				case 4:System.out.println("Invalid User Choice");
			}
		}scanner.close();

	}

}
