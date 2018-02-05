package CarDemo;
import java.util.*;
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
