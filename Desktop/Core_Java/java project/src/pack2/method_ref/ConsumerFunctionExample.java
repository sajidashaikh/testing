package pack2.method_ref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionExample {
	public static void main(String[] args) {
		Consumer<Integer> con = i->System.out.println(" " +i);
		List<Integer> L1 = Arrays.asList(new Integer(10),new Integer(20),new Integer(30));
		printList(L1,con);
		
	}
public static void printList(List<Integer> listofIntegers , Consumer<Integer> con) {
for(Integer integer:listofIntegers) {
	con.accept(integer);
}
}
}