package jan8;

import java.util.Arrays;
import java.util.List;

public class foreachExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		/*for(int i =0;i<numbers.size();i++) {
			System.out.println(i);
		}*/
		List<String> names = Arrays.asList("Sajida","Shirin","Haseena");
		for(String s : names) {
			System.out.println(s);
		}
		
		List<String> name = Arrays.asList("Sajida","Shirin","Haseena");
		name.forEach(i ->System.out.println(i));
		
		
		
		
	}
}
