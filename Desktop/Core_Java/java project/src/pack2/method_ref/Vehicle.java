package pack2.method_ref;

public interface Vehicle {
	default void startVehicle() {
		System.out.println("Vehicle is starting");
	}

}
