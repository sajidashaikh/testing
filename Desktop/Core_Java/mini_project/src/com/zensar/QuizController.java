package com.zensar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class QuizController extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		String requestAction=request.getParameter("requestAction");
	   if(requestAction.equalsIgnoreCase("add")) {
		String username = request.getParameter("USERNAME");
		String userpass = request.getParameter("USERPASS");
		String category = request.getParameter("CATEGORY");
		String email = request.getParameter("EMAIL");
		
	   }
		
	}

}
