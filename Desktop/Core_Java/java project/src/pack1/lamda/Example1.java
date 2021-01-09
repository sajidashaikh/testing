package pack1.lamda;
import java.util.HashMap;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Map<String,Integer>prices = new HashMap<>();
		prices.put("Apple",140);
		prices.put("Mango",120);
		prices.put("Banana",40);
		prices.put("Grapes",50);
		prices.put("Custard-Apple",100);
		prices.forEach((k,v)->System.out.println("Fruit: " +k+ ",Price:" +v));
	}

}
