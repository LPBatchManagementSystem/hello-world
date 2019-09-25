package com.virtusa.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.virtusa.controller.MainController;

public class LoginView
{
public void Menu()
{
				try {
					InputStreamReader reader=new InputStreamReader(System.in);
					BufferedReader buffer=new BufferedReader(reader);
					
				System.out.println("welcome to the login portal!!");
				System.out.println("entre your credentials to login:");
				System.out.println("username: ");
				String Username = buffer.readLine();
				System.out.println("password: ");
				String Password = buffer.readLine();
				MainController mainControl = new MainController();
				//System.out.println("one");
				mainControl.Authenticate(Username,Password);
				//System.out.println("two");
				}catch(Exception e) {
					System.out.println("check exeception at loginView page!!");
					e.printStackTrace();
				}
			}
	}


