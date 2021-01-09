package java8;

import java.util.function.IntBinaryOperator;

interface Callinterface{
	public int calculate_balance(int wd);
}
public class Example2 {
	public static void main(String[] args) {
		int balance = 50000;
		IntBinaryOperator impl1=(balance,wd)->balance,wd;
		//Callinterface c = (wd,balance)->balance-wd;
		
	}

	@Override
	public int calculate_balance(int wd) {
		// TODO Auto-generated method stub
		return 0;
	}

}
