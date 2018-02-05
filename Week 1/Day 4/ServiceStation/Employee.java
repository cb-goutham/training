package ServiceStation;
import java.util.*;
public class Employee extends Person
{
	String empId;
	Employee(String n,int a,int c)
	{
		super(n,a,c);
		Scanner in = new Scanner(System.in);
		System.out.print("EMPLOYEE ID : ");
		empId = in.next();
	}

	public void getter()
	{
		System.out.println("NAME : "+super.getName());
		System.out.println("EMPLOYEE ID : "+empId);
		System.out.println("AGE : "+super.getAge());
		System.out.println("CONTACT : "+super.getContact());
	}

}