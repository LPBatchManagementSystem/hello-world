
package com.virtusa.client;

import java.util.Scanner;

import com.virtusa.controller.StudentController;
import com.virtusa.view.StudentView;

public class StudentClient {

	public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
		System.out.println("1. Register student");
		System.out.println("2. View student");
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		StudentView studentView=new StudentView();

		if(option==1){
		studentView.registerStudentForm();
		}
		if(option==2){
       StudentController studentController=new StudentController();
       studentController.viewStudent();
		}

	}

}
