package java8;

public class ClassImple implements Inter2{
	
	public static void main(String[] args) {
		Inter2 obj = new ClassImple();
		obj.method2();
	}
	public void method1() {
		System.out.println("I am First method");
	}
	
	public void method2() {
		System.out.println("I am second method");
	}
}
