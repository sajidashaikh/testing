package saturday;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Assignment {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
	
		/*String datejoining = "2016-09-27";
		
		LocalDate datejoin = LocalDate.parse(datejoining);*/
		
		
		
		
		//Total Experience in the Company 
		LocalDate datejoining = LocalDate.of(2016,Month.SEPTEMBER,27);
		Period experience = Period.between(datejoining, date);
		int years = experience.getYears();
		int months = experience.getMonths();
		int days = experience.getDays();
		 
		System.out.println("Experience of Mr.Abhimanyu in the ABC Company is:" +years+ "years:" + months+ "months:" +days+ "days");
		
		
		 
		//Total Promotion days in the company
		String datepromotion = "2018-02-22";
		LocalDate datepromo = LocalDate.parse(datepromotion);
		
		/*long noOfDayspromo = ChronoUnit.DAYS.between(datepromo, date);
		
		System.out.println("experience after getting promotion:" +noOfDayspromo);*/
		long noOfyearspromo = ChronoUnit.YEARS.between(datepromo, date);
		System.out.println("Experience after getting promotion in years:" +noOfyearspromo);	
		
		//Total days spend in the company after certification
		String datecertificate = "2020-06-21";
		LocalDate datecert = LocalDate.parse(datecertificate);
		
		long noOfDayscert = ChronoUnit.DAYS.between(datecert, date);
		System.out.println("Days after certification:" +noOfDayscert);
		
		
		
		
		
	}

}
