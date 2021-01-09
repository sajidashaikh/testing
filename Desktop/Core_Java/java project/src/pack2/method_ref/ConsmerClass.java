package pack2.method_ref;
import java.util.function.*;


public class ConsmerClass {
	static void UserMethod(String s) {
		System.out.println("Here we are using :" +s);
	}
	static void PrintNumber(int x) {
		System.out.println("print the number:" +x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using Interface reference ::
		Consumer<String> c = ConsmerClass::UserMethod;
		c.accept("INDIA");
		Consumer<Integer> c1 = ConsmerClass::PrintNumber;
		c1.accept(150);
	}

}
