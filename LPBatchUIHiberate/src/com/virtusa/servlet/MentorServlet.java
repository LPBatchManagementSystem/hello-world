package com.virtusa.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import com.virtusa.model.BatchModel;
import com.virtusa.model.CalendarModel;
import com.virtusa.model.MentorModel;
import com.virtusa.model.UpdateMentorDetailsModel;
import com.virtusa.service.MentorService;
import com.virtusa.service.MentorServiceImpl;


/**
 * Servlet implementation class MentorServlet
 */
@WebServlet("/mentorprofileviewservlet")
public class MentorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	MentorService mentorService;

	public MentorServlet() {
		super();
		// TODO Auto-generated constructor stub
		
		mentorService=(MentorService) new MentorServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		System.out.println("hello");
		String userId=String.valueOf(session.getAttribute("userId"));

		System.out.println("mentor"+userId);
		String action = request.getParameter("action");

		if (action.contentEquals("view")) {

	
			List<MentorModel> mentorModelList = mentorService.retrieveMentorDetails(userId);

			request.setAttribute("mentorModelList", mentorModelList);
			System.out.println(mentorModelList);
			session.setAttribute("mentorModelList", mentorModelList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ViewMentorProfile.jsp");
			dispatcher.forward(request, response);
		}
				
				}

			
		}

	
