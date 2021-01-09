package java8;

import java.util.function.IntBinaryOperator;

interface Callinterface {
	public default void display() {
		System.out.println("printing");
	}
	
}
public class ClassImplement implements Callinterface{
	public static void main(String[] args) {
		IntBinaryOperator impl1=(x,y)->x*y+x;
		System.out.println("add numbers:" +impl1.applyAsInt(10, 20));
		
	}
}