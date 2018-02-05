package CarDemo;
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