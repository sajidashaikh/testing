package pack2.method_ref;

class Employee{
	private String name;
	Employee(){
		
	}
	

interface interfaceOne{
	Employee get();
}
interface interfaceTwo{
	Employee get(String name) {
		this.name = name;
		
	}
}
public class Example1 {

}
}