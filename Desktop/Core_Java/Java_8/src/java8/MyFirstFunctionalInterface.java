package java8;


@FunctionalInterface
public interface MyFirstFunctionalInterface{
	public void firstWork();
	default void doSomeMoreWork1() {
		System.out.println("Hey");
	}
	default void doSomeMoreWork2() {
		System.out.println("Hello");
	}	
	
}


