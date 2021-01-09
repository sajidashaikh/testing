package pack2.method_ref;
interface MyInterface1
{
	void NewMethod();
	public static  void display()
	{
		//return;
		System.out.println("this to display");
	}
}

public class InstanceExample {
	public void MyMethod1()
	{
		System.out.println("this is instance method of class");
	}
	public static void main(String[] args) {
		InstanceExample IE = new InstanceExample();
		MyInterface1 m = IE::MyMethod1;
		MyInterface1 m1 = IE::NewMethod();
		m1.display();
		m.NewMethod();
		
		
		System.out.println(m);
		
		
	}

}
