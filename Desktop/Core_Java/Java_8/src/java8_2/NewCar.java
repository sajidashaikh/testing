package java8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class NewCar {
	public static void main(String[] args) {
		List<Car>list = new ArrayList<Car>();
		list.add(new Car("volvo","abc123",4,500000));
		list.add(new Car("TATA","efg123",4,650000));
		list.add(new Car("BMW","hij123",4,700000));
		Comparator<Car> carBrand = new Comparator<Car>() {
			public int compare(Car car1,Car car2) {
				return car1.brand.compareTo(car2.brand);
			}
		};
		
		Iterator<Car> it = list.iterator();
		while(it.hasNext()) { Car obj = it.next();}
		list.forEach(System.out::println);
		
		Comparator<Car> carNumber = (car1, car2)->car1.number.compareTo(car2.number);
		//Collections.sort(list,Collections.reverseOrder());
		Collections.sort(list,carBrand);
		Collections.sort(list,carNumber);
		Comparator<Car> Price =(car1,car2)->car1.price- car2.price;
		Collections.sort(list,Price);
		
		System.out.println(list);
		
		
	}

}
