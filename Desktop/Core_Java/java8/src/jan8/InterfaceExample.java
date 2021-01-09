package jan8;

/*interface exam{
	void display();
	default void show() {
		System.out.println("Good noon &");
	}
}

class example implements exam1,exam{
	public void display() {
		System.out.println("Exams are near");
	}
	public void show() {
		System.out.println("Good noon &");}	
}

public class InterfaceExample {
	public static void main(String[] args) {
		example e = new example();
		e.show();	
		System.out.println("Hello friends:");
		e.display();

		
	}
}*/

/*interface A{
	default void show(){
		System.out.println("Interface A");
		}
}
interface B{
	default void show() {
		System.out.println("Interface B");
	}
}
class Demo{
	public void show() {
		System.out.println("This is class Demo");
	
}
}
public class InterfaceExample extends Demo implements A,B{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
	}
}*/


//using static keyword
/*interface A{
	static void show() {
		System.out.println("Hello");
	}
}
class InterfaceExample implements A{
	public static void main(String[] args) {
		A.show();
	}
}*/