package ServiceStation;
import java.util.*;
public class Customer extends Person
{
	String empAssigned;
	String CusId;
	Customer(String n,int a,int c)
	{
		super(n,a,c);
		Scanner in = new Scanner(System.in);
		System.out.print("CUSTOMER ID : ");
		CusId = in.next();
		System.out.print("EMPLOYEE ASSIGNED : ");
		empAssigned = in.next();
	}
	public String getName()
	{
		return super.getName();
	}

	public void getter()
	{
		System.out.println("NAME : "+super.getName());
		System.out.println("CUSTOMER ID : "+CusId);
		System.out.println("AGE : "+super.getAge());
		System.out.println("CONTACT : "+super.getContact());
		System.out.println("EMPLOYEE ASSIGNED : "+empAssigned);
	}

}