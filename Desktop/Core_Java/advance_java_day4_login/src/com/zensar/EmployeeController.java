package com.zensar;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.zensar.bean.Employee;

public class EmployeeController extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		String requestAction=request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("viewAll")) {
		System.out.println("We are now in method()");
		EmployeeRepository employeeRepository = new EmployeeRepository();
		List<Employee>listOfAllEmployees = employeeRepository.getAllEmployee();
		System.out.println("listOfAllEmployees:" +listOfAllEmployees);
		RequestDispatcher rd = request.getRequestDispatcher("viewAllEmployee.jsp");
		request.setAttribute("listOfAllEmployees", listOfAllEmployees);
		try {
			rd.forward(request, response);
			
		}catch(Exception e) {
			System.out.println("Exception Occured:" +e);
		}
	}
		else if(requestAction.equalsIgnoreCase("delete")) {
			// code for employee deletion
			System.out.println("We are going to delete an employee");
			EmployeeRepository employeeRepository = new EmployeeRepository();
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			employeeRepository.deleteEmployee(employeeId);
			// RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			try {
			// rd.forward(request, response);
			response.sendRedirect("index.jsp");
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			}
		else if(requestAction.equalsIgnoreCase("openUpdateForm")) {
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			// connect to db using Repository and fetch the details of this employee
			EmployeeRepository employeeRepository = new EmployeeRepository();
			Employee employee = employeeRepository.getEmployee(employeeId);
			RequestDispatcher rd = request.getRequestDispatcher("updateEmployeeForm.jsp");
			request.setAttribute("employee",employee);
			try {
				rd.forward(request,response);
			}catch(Exception e) {
				System.out.println("Exception Occured:" +e);
			}
			
			}
		else if(requestAction.equalsIgnoreCase("update")) {
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			String employeeName = request.getParameter("employeeName");
			String designation = request.getParameter("designation");
			int salary = Integer.parseInt(request.getParameter("salary"));
			String gender = request.getParameter("gender");
			String city = request.getParameter("city");
			Employee employee = new Employee(employeeId, employeeName, designation, salary, gender, city);
			EmployeeRepository employeeRepository = new EmployeeRepository();
			employeeRepository.updateEmployee(employee);
			try {
			response.sendRedirect("index.jsp");
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			}
		else if(requestAction.equalsIgnoreCase("add")) {
			int employeeId = Integer.parseInt(request.getParameter("employeeId"));
			String employeeName = request.getParameter("employeeName");
			String designation = request.getParameter("designation");
			int salary = Integer.parseInt(request.getParameter("salary"));
			String gender = request.getParameter("gender");
			String city = request.getParameter("city");
			
			System.out.println("employeeId:"+employeeId);
			System.out.println("employeeName:"+employeeName);
			System.out.println("designation:"+designation);
			System.out.println("salary:"+salary);
			System.out.println("gender:"+gender);
			System.out.println("city:" +city);
			

			EmployeeRepository employeeRepository = new EmployeeRepository();
			Employee employee = new Employee(employeeId, employeeName, designation, salary, gender,city);
			employeeRepository.addEmployee(employee);

			try {
				response.sendRedirect("index.jsp");
				} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
				}
			
		}
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		doGet(request,response);
	}
	
}
