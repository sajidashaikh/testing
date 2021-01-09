package pack2.method_ref;

public interface Vehicle2 {
	default void startVehicle() {
		System.out.println("Vehicle is starting");
	}

}
