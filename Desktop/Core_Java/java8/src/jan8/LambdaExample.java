package jan8;

interface ABC{
	void display(int i,int j);
}
//without lambda expression
/*public class LamdaExample{
	public static void main(String[] args) {
		ABC obj;
		obj = new ABC() {
			public void display() {
				System.out.println("Hello World");
			}
		};
		obj.display();
	}
}
*/
//with Lambda expression with multiple lines

/*public class LambdaExample{
	public static void main(String[] args) {
		ABC obj;
		obj = ()->{
			System.out.println("Hello World");
			System.out.println("This is Feature of Lambda Expression");
			System.out.println("This is for multiple line");
		};
		obj.display();
	}
}
*/
//with Lambda expression with single line display
/*
public class LamdaExample {
public static void main(String[] args) {
	ABC obj = () ->System.out.println("Hello World");
	obj.display();
	
}
}
*/

//By passing parameters in interface
public class LambdaExample{
	public static void main(String[] args) {
		ABC obj;
		obj = (i,j)->{
			System.out.println("Hello " +i);
			System.out.println("Hello World" +j);
		};
		obj.display(20, 21);
		
		
	}
}














