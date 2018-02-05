package IncomeTax;
import java.util.*;
class Employee
{
	String empId;
	String name;
	char gender;
	double TaxableIncome;
	public void setter()
	{
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		in.useDelimiter("\n");
		System.out.print("EMP ID :");
		empId=in.next();
		System.out.print("NAME : ");
		name = in.next();
		System.out.print("Gender : ");
		gender = in.next().charAt(0);
		System.out.print("TaxableIncome : ");
		TaxableIncome = in.nextDouble();

	}
	public String getId()
	{
		return empId;
	}
	public char getGender()
	{
		return gender;
	}
	public double getIncome()
	{
		return TaxableIncome;
	}
	public void display()
	{
		System.out.println(empId+" | "+name+" | "+gender+" | "+TaxableIncome+" | "+IncomeTaxGenerator.calcTax(this));
	}

}