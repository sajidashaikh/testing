package part2;

public interface Vehicle {
	default void startVehicle() {
		System.out.println("Vehicle is starting");
	}

}
