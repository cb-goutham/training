package CarDemo;
import java.util.*;
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
