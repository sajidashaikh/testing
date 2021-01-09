package pack2.method_ref;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ObjectToInstanceMethod {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("efg");
		l.add("hij");
		Collections.sort(l,String::compareToIgnoreCase);
		l.forEach(System.out::println);
		
	}

}
