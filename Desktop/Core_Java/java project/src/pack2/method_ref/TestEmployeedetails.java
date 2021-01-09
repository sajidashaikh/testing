package pack2.method_ref;

import java.util.ArrayList;
import java.util.Collection.*;
import java.util.Arrays;

public class TestEmployeedetails {
	public static void main(String[] args) {
		Employeedetails e1 = new Employeedetails(101,22,20000,"m","sunil","Sharma");
		Employeedetails e2 = new Employeedetails(102,24,25000,"f","amaira","Sahane");
		Employeedetails e3 = new Employeedetails(103,25,55000,"f","Surekha","Sonawane");
		Employeedetails e4 = new Employeedetails(104,23,15000,"m","Surek","Sonawane");
		
		ArrayList<Employeedetails> emp = new ArrayList<Employeedetails>();
		emp.addAll(Arrays.asList(new Employeedetails[]{e1,e2,e3,e4}));
		System.out.println(EmployeedetailsPredicate.filterEmp(emp,EmployeedetailsPredicate.isAdultFemale()));
	}

}
