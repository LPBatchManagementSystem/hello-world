package com.virtusa.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.sun.jmx.snmp.UserAcl;
import com.virtusa.model.UserLogin;
import com.virtusa.service.UserService;
import com.virtusa.service.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/userLoginServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserService userService=new UserServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			String user=request.getParameter("username");
			int userId=Integer.parseInt(user);
			System.out.println(userId);
		String password=request.getParameter("password");

		HttpSession session = request.getSession();
		session.setAttribute("userId", userId);
	
		/** request.setAttribute(username, password);
		UserController uc = new UserController();
		boolean userType=uc.userAuthentication(username, password);**/
		
		UserLogin login=new UserLogin();
		login.setId(userId);
		login.setPassword(password);
		
		boolean userType=userService.userAuthenticationService(login);
	
		
		if (userType==true) {
              
			 RequestDispatcher dispatcher=
						request.getRequestDispatcher("LpMenu.jsp");
				dispatcher.forward(request,response);
		
		
		
	}
		else {
			
			 
			 RequestDispatcher dispatcher=
						request.getRequestDispatcher("index.html");
				dispatcher.forward(request,response);
		}

}}
