package pack2.method_ref;

public class Car implements Vehicle, Vehicle2{
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.startVehicle();
		c1.vehicleReady();
		
	}
	public void vehicleReady() {
		System.out.println("Vehicle ready");
	}
	public void startVehicle() {
		System.out.println("New implementation");
		Vehicle2.super.startVehicle();
	}
}
