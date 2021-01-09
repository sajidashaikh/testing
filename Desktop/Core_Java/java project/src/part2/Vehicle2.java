package part2;

public interface Vehicle2 {
	default void startVehicle() {
		System.out.println("Vehicle is starting");
	}
static void show() {
	System.out.println("using static method");
}
}
