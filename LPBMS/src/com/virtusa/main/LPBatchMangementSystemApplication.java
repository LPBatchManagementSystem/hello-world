package com.virtusa.main;

import com.virtusa.view.LoginView;
import com.virtusa.view.MentorView;

public class LPBatchMangementSystemApplication {

	public static void main(String[] args) {
		
		LoginView lv = new LoginView();
		lv.Menu(); 
		
		MentorView mentorView = new MentorView();
		mentorView.mentorMenu();
        
	}

}
