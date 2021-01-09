package java8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyCollection {
	public static void main(String[] args) {
		List<String> listA = new ArrayList<>();
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		listA.add(0,"element 0");
		listA.remove("element2");
		Collections.sort(listA);
		Object[] obj = listA.toArray();
		String[] obj1 = listA.toArray(new String[0]);
		Set<String> set = new HashSet<String>();
		set.addAll(listA);
	}

}
