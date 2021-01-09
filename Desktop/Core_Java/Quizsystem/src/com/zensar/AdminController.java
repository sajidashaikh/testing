package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.bean.Question;

public class AdminController extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		String requestAction=request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("update")) {
			System.out.println("updating questions");
			int qid =Integer.parseInt(request.getParameter("qid"));
			String questions = request.getParameter("questions");
			String option1 = request.getParameter("option1");
			String option2 = request.getParameter("option2");
			String option3 = request.getParameter("option3");
			String option4 = request.getParameter("option4");
			String answer = request.getParameter("answer");
			AdminRepository adminRepository = new AdminRepository();
			Question question1 = new Question(qid, questions, option1, option2, option3, option4, answer);
			adminRepository.updateQuestion(question1);
			try {
				response.sendRedirect("updateQuestion.jsp");
				
			}catch(Exception e) {
				System.out.println("Exception Occured:" +e);
			}

			
			
		}
	}

	
}
