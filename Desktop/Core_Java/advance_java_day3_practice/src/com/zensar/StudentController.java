package com.zensar;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.bean.Student;

public class StudentController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
		if (requestAction.equalsIgnoreCase("viewAll")) {
			System.out.println("we are now in a method()");
			StudentRepository studentRepository = new StudentRepository();
			List<Student> listOfAllStudent = studentRepository.getAllStudent();
			System.out.println("listOfAllStudent:" + listOfAllStudent);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllStudent.jsp");
			request.setAttribute("listOfAllStudent", listOfAllStudent);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}

		}

		else if (requestAction.equalsIgnoreCase("delete")) {
			// code for employee deletion
			System.out.println("We are going to delete an employee");
			StudentRepository studentRepository = new StudentRepository();
			int rollno = Integer.parseInt(request.getParameter("rollno"));
			studentRepository.deleteStudent(rollno);
			// RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			try {
				// rd.forward(request, response);
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}
		} else if (requestAction.equalsIgnoreCase("openUpdateForm")) {
			int rollno = Integer.parseInt(request.getParameter("rollno"));
			// connect to db using Repository and fetch the details of this employee
			StudentRepository studentRepository = new StudentRepository();
			Student student = studentRepository.getStudent(rollno);
			RequestDispatcher rd = request.getRequestDispatcher("updateStudentForm.jsp");
			request.setAttribute("student", student);
			try {
				rd.forward(request, response);
			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}

		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String studentName = request.getParameter("studentName");
		String course = request.getParameter("course");
		int duration = Integer.parseInt(request.getParameter("duration"));
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String hometown = request.getParameter("hometown");

		System.out.println("rollno:" + rollno);
		System.out.println("studentName:" + studentName);
		System.out.println("course:" + course);
		System.out.println("duration:" + duration);
		System.out.println("age:" + age);
		System.out.println("gender:" + gender);
		System.out.println("hometown:" + hometown);

		StudentRepository studentRepository = new StudentRepository();
		Student student = new Student(rollno, studentName, course, duration, age, gender, hometown);
		studentRepository.addStudent(student);

		
		try {
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			System.out.println("Exception Occured:" + e);
		}

	}

}
