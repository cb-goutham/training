package IncomeTax;
import java.util.*;
class IncomeTaxGenerator
{
	public static double MaleTax(Employee e)
	{
		double inc = e.getIncome();
		if(inc < 250000)
			return 0;
		else if(inc >=250000 && inc < 600000)
			return (5*inc)/100;
		else if(inc >=600000 && inc < 1000000)
			return (20*inc)/100;
		else
			return (30*inc)/100;
	}
	public static double FemaleTax(Employee e)
	{
		double inc = e.getIncome();
		if(inc < 350000)
			return 0;
		else if(inc >=350000 && inc < 700000)
			return (5*inc)/100;
		else if(inc >=700000 && inc < 1200000)
			return (20*inc)/100;
		else
			return (30*inc)/100;

	}
	public static double calcTax(Employee e)
	{
		if(e.getGender()=='M' || e.getGender()=='m')
			return (IncomeTaxGenerator.MaleTax(e));
		else
			return (IncomeTaxGenerator.FemaleTax(e));
	}
}