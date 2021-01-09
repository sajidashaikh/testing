package java8;
import java.util.function.IntBinaryOperator;
@FunctionalInterface

interface EmpDetails{
	//public String EmpData(String data);
	public boolean compareTask(int a,int b);
	
}
public class ClassImplemen {
	public static void main(String[] args) {
	EmpDetails ed = (a,b)->{return a>b;	};
	boolean result = ed.compareTask(23, 20);
	System.out.println(result);
	
}
}

