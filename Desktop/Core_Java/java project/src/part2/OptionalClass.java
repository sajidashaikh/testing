package part2;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String[] s = new String[10];
		s[4]="Java is one of the programming language";
		Optional<String> str = Optional.ofNullable(s[8]);
		if(str.isPresent()) {
		String s1 = s[4].substring(3,6);
		System.out.println(s1);
		}
		else
			System.out.println("String not available");
		//solution to null pointer exception in above code is Optionals
		//Optional works similar to exception but if dont want to use exception you can use optional
	}

}
