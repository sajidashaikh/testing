package java8_2;
import java.util.ArrayList;
import java.util.List;

public class Car {
	public String brand;
	public String number;
	public int noOfDoor;
	public int price;
	public Car(String brand, String number, int noOfDoor,int price) {
		super();
		this.brand = brand;
		this.number = number;
		this.noOfDoor = noOfDoor;
		this.price = price;
		
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", number=" + number + ", noOfDoor=" + noOfDoor + ", price=" + price + "]";
	}
	

}
