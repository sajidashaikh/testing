package saturday;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) 
	{
		Optional<String> opt1 = Optional.of("Netflix is the best");
		Optional<String> opt2 = Optional.empty();
		System.out.println(opt1.map(String::toLowerCase));
		List<String> cities = Arrays.asList("London","HongKong","Paris","NewYork");
		System.out.println("Original list:" +cities);
		System.out.println("list transformed:" + transform(cities));
		
		/*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); List<Integer>
	    squares = numbers.stream() .map( i -> i*i) .collect(Collectors.toList());
	    System.out.println("original list of numbers : " + numbers);
	    System.out.println("transformed list of integers using Map in Java 8 : " + squares);*/
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); List<Integer>
	    squares = numbers.stream() .map( i -> i*i) .collect(Collectors.toList());
	    System.out.println("original list of numbers : " + numbers);
	    System.out.println("transformed list of integers using Map in Java 8 : " + squares);
	
	  
	}

	private static String transform(List<String> cities) {
		// TODO Auto-generated method stub
		return null;
	}
}


