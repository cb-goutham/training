import java.util.*;
class Car
{
	int speed;
	double regPrice;
	String color;
	Car(int s,double r,String c)
	{
		speed =s;
		regPrice=r;
		color = c;
	}
	public double getSalePrice()
	{
		return regPrice;
	}
}
class Truck extends Car
{
	int weight;
	Truck(int s,double p,String c,int w)
	{
		super(s,p,c);
		weight = w;
		
	}
	public double getSalePrice()
	{
		double p=super.getSalePrice();
		if(weight>2000)
			return (p-(p*10/100));
		
		else
			return (p-(p*20/100));

	}
}

class Ford extends Car
{
	int year;
	int manuDiscount;
	Ford(int s,double p,String c,int y,int m)
	{
		super(s,p,c);
		year = y;
		manuDiscount = m;
	
	}
	public double getSalePrice()
	{
		double p = super.getSalePrice();
		return (p - manuDiscount);
	}

}
 
class Sedan extends Car
{
	int length;
	Sedan(int s,double p,String c,int l)
	{
		super(s,p,c);
		length = l;
		
	}
	public double getSalePrice()
	{
		double p = super.getSalePrice();
		if(length>20)
			return (p-(p*5/100));
		else
			return (p-(p*10/100));
	}
}

public class MyOwnAutoShop
{
	public static void main(String[] args) {
		//Car c = new Car(150,500000,"Black");
		Sedan s = new Sedan(150,500000,"Black",15);
		Ford f = new Ford(200,700000,"RED",2017,5000);



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
	
		
	}
}