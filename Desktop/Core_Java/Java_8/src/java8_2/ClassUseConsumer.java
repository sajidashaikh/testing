package java8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClassUseConsumer{
	public static void main(String[] args) {
		
	
	List<Integer> li = new ArrayList<Integer>();
	li.add(100);
	li.add(200);li.add(300);
	Consumer<Integer> c = (Integer) ->System.out.println(li);
	
	
	

}
}
