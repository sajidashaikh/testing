package java8_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstClass {
	 public static void main(String[] args) 
	    {
	        List<Employee> list = Arrays.asList(new Employee(1,22,"Sushant",30000), 
	                                        new Employee(2,23,"Anugrah",25000), 
	                                        new Employee(3,24,"Rudra",40000), 
	                                        new Employee(4,25,"Riya",35000));
	 
	        Collections.sort(list, new nameComp()
	                                .thenComparing(new  AgeComp())
	                                .thenComparing(new SalaryComp()));
	 
	        System.out.println(list);
	    }
	}