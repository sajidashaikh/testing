package saturday;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("current date:" +date);
		LocalDate l = LocalDate.now();
		Month m = l.getMonth();
		System.out.println("current month:" +m);
		
	}

}
