import java.util.*;
public class income
{
	int emp_id;
	String ename;
	String gender;
	double taxable_income;
	income(String name,String g,double inc)
	{
		ename = name;
		gender = g;
		taxable_income = inc;
	}
	public static int calculate_tax(String g , double sal)
	{
		if(g.equals("Male"))
		{
			if(sal < 250000)
				return 0;
			else
			if(sal>=250000 && sal<500000)
				return 5;
			else
			if(sal>=500000 && sal < 1000000)
				return 20;
			else
				return 30;
		}
		else
		{
			if(sal < 250000)
				return 0;
			else
			if(sal>=250000 && sal<500000)
				return 2;
			else
			if(sal>=500000 && sal < 1000000)
				return 10;
			else
				return 20;
		}
	}
	public static void main(String[] args) {
		List<income> employee = new ArrayList<income>();
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		char ch;
		do
		{
			System.out.print("ENAME : ");
			String name = in.next();
			System.out.print("GENDER : ");
			String gender = in.next();
			System.out.print("taxable_income : ");
			double sal = inp.nextDouble();
			income i = new income(name,gender,sal);
			employee.add(i);
			System.out.println("DO YOU WANT TO ADD ANOTHER EMPLOYEE");
			ch = in.next().charAt(0);
		}while(ch=='y' || ch=='Y');

		System.out.println("EMPLOYEE DETAILS");
		for(income i : employee)
		{
			System.out.println("ENAME : "+i.ename);
			System.out.println("GENDER : "+i.gender);
			System.out.println("TAXABLE_INCOME : "+i.taxable_income);
			int p = calculate_tax(i.gender,i.taxable_income);
			System.out.println("TAX AMOUNT : "+(p*i.taxable_income)/100);
		}

	}
}