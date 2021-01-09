package part2;

import java.util.Optional;

public class OptionalClass2 {
	public static void main(String[] args) {
		String[] s = new String[10];
		Optional<String> str = Optional.ofNullable(s[8]);
		if(str.isPresent()) {
		String s1 = s[4].substring(3,6);
		System.out.println(s1);
		}
		else {
			System.out.println("String not available");
		//solution to null pointer exception in above code is Optionals
		//Optional works similar to exception but if dont want to use exception you can use optional
	}


s[8] = "YEAR IS GOING TO CHANGE SOON";
Optional<String> str1 = Optional.ofNullable(s[8]);
if(str1.isPresent()) {
	String s1 = s[8].substring(2, 6);
	System.out.println(s1);
	
}else 
	System.out.println("using optional class");

}
}

