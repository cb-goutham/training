package CarDemo;
import java.util.*;
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