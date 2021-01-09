package part2;



public class Car implements Vehicle, Vehicle2{
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.startVehicle();
		c1.vehicleReady();
		Vehicle2.show();
		
	}
	public void vehicleReady() {
		System.out.println("Vehicle ready");
		Vehicle.super.Color();
		Vehicle2.super.color();
	}
	public void startVehicle() {
		System.out.println("New implementation");
		Vehicle2.super.startVehicle();
	}
}
