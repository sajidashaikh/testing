package pack2.method_ref;

public class Animal implements Moveable,Walkable{
	public static void main(String[] args) {
		Animal c1 = new Animal();
		c1.m1();
		c1.m2();
		
	}
	
	public void m2() {
		System.out.println("What all Animals can do");
		Moveable.super.m1();
	}

	public void m1() {
		System.out.println("Animal can Walk");
	}
	
}
