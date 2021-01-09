package pack2.method_ref;

public interface Walkable {
	default void m1() {
		System.out.println("Animal can Walk");
	}
}
