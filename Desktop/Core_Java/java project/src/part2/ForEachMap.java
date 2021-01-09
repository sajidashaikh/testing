package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachMap {
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
	        Map<Integer,String> map = new HashMap<Integer,String>();
	        map.put(101, "asd");
	        map.put(102, "fgh");
	        map.put(103,"jkl");
	        System.out.println("------EMP Details with stream --------");
	        
	        emp.stream().forEachOrdered((System.out::println));
	        map.forEach((k,v)->System.out.println("key = " +k +"value= " +v));
	        BiConsumer<Integer,String> bi = (a,b)->{System.out.println("key =" +a);
	        System.out.println("value " +b);
	        
	        };
	        map.put(110, "aaa");
	        map.put(111,"bbb");
	        map.forEach(bi);
	        
			
		}
	}



