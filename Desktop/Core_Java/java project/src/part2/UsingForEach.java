package part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UsingForEach {
	public static void main(String[] args) {
		ArrayList<String> emp = new ArrayList<>();
		emp.add("Sajida");
		emp.add("Deepika");
		emp.add("Chetana");
		emp.add("Vrushali");
		emp.add("Vishakha");
		System.out.println("***********EMP Details***********");
		//for lambda expression
		emp.forEach(e->System.out.println(e));
		Collections.sort(emp); 
        System.out.println("Sorted ArrayList " + "in Ascending order : "
                           + emp);
        
		
	}
}
