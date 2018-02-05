package ServiceStation;
import java.util.*;
abstract class Vehicle
{
	String brand;
	String color;
	double ServiceCharge;
	
	Vehicle(String b,String c)
	{
		brand = b;
		color = c;

	}
	public abstract double getServiceCharge();

	public String getColor()
	{
		return color;
	}

	public String getBrand()
	{
		return brand;
	}

	public double ServiceCharge()
	{
		return ServiceCharge;
	}


}