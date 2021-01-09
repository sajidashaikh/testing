package saturday;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Assignment1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		//Total Experience in the Company 
		LocalDate datejoining = LocalDate.of(2016,Month.SEPTEMBER,27);
		Period experience = Period.between(datejoining, date);
		int years = experience.getYears();
		int months = experience.getMonths();
		int days = experience.getDays();
		 
		System.out.println("Experience of Mr.Abhimanyu in the ABC Company is:" +years+ "years:" + months+ "months:" +days+ "days");
		
		
		 
		//Total years after promotion in the company
		LocalDate datepromotion = LocalDate.of(2018, 02, 22);
		Period datepromo = Period.between(datepromotion, date);
		int year = datepromo.getYears();
		System.out.println("Experience after getting promotion in years:" +year);	
		
		
		
		
		/*String datepromotion = "2018-02-22";
		LocalDate datepromo = LocalDate.parse(datepromotion);*/
		
		/*long noOfDayspromo = ChronoUnit.DAYS.between(datepromo, date);
		
		System.out.println("experience after getting promotion:" +noOfDayspromo);
		long noOfyearspromo = ChronoUnit.YEARS.between(datepromo, date);*/
	
		
		//Total days spend in the company after certification
		
		LocalDate datecertificate = LocalDate.of(2020,06,21);
		Period datecert = Period.between(datecertificate, date);
		int day = datecert.getDays();
		System.out.println("Days after getting certified:" +day);
		
	}
}
