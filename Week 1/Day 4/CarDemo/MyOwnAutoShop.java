package CarDemo;
import java.util.*;

public class MyOwnAutoShop
{
	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();
		
		Car c = new Car(150,500000,"Black");
		cars.add(c);
		Sedan s = new Sedan(150,500000,"Black",15);
		cars.add(s);
		Ford f = new Ford(200,700000,"RED",2017,5000);
		cars.add(f);
		Truck t = new Truck(100,6000000,"BLUE",2500);
		cars.add(t);



		System.out.println("SEDAN DETAILS :");
		System.out.println("SPEED : "+s.speed);
		System.out.println("PRICE : "+s.getSalePrice());
		System.out.println("COLOR : "+s.color);
		System.out.println("LENGTH : "+s.length);


		System.out.println("FORD DETAILS :");
		System.out.println("SPEED : "+f.speed);
		System.out.println("PRICE : "+f.getSalePrice());
		System.out.println("COLOR : "+f.color);
		System.out.println("YEAR : "+f.year);


		System.out.println("\nSALE PRICE FOR \n");
		for(Car car : cars)
		{
			System.out.println(car.getClass().getName().substring(8)+": Rs "+car.getSalePrice()+"\n");
		}
	
		
	}
}