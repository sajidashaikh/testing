package pack2.method_ref;

public interface Moveable {
	default void m1() {
		System.out.println("Animal can Move");
	}

}
