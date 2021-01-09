package java8_2;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
public class ClassTreeSet {
	public static void main(String[] args) {
		TreeSet<String> ints = new TreeSet<String>();
		ints.add("apple");
		ints.add("mango");
		ints.add("Apple");
		ints.add("carrot");
		ints.add("mango");
		ints.add("chickoo");
		ints.add("banana");
		ints.add("strawbery");
		
		System.out.println("first set :"+ints.descendingSet());
		System.out.println("reverse set:"+ints.subSet("Apple", "mango"));
		System.out.println(ints.contains("mango"));
		System.out.println(ints.size());
		System.out.println(ints.remove("apple"));
		System.out.println(ints.headSet("banana")); //headset for before b
		System.out.println(ints.tailSet("carrot"));	//tailset for after c
		Iterator<String> it = ints.iterator();
		System.out.println("iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println("\t");}
		ints.forEach(f-> System.out.println(f));	//java 1.8
			//ints.forEach(System.out::println);
		
		
		 class ClassCompare implements Comparator<String>{
			
		public int compare(String ints1 ,String ints2) {
			int s = ints1.compareTo(ints2);
			if(s>0) {
				return -1;
			}
			else if(s<0) {
				return 1;
				
			}
			else
			{
				return 0;
			}
			
		}
		
		
	}

}
}
