import java.util.*;
class Person
{
	String name;
	int age;
	String id;
	int contact;

	public String getId()
	{
		return id;
	}

	public int set()
	{
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		char ch;
		System.out.print("Enter the Person details : ");
		System.out.println("NAME : ");
		name = in.next();
		System.out.print("AGE : ");
		age = inp.nextInt();
		System.out.print("CONTACT : ");
		contact = inp.nextInt();
		System.out.print("ARE YOU A CUSTOMER OR AN EMPLOYEE :(C/E) ?");
		ch = in.next().charAt(0);
		if(ch=='C' || ch=='c')
		{
			System.out.print("ENTER THE EMPLOYEE ID Assigned : ");
			id = in.next();
			return 1;
		}
		else
			id = null;
	 return 0;
	}
	public void display(char ch)
	{
		System.out.println("NAME : "+name);
		System.out.println("AGE : "+age);
		System.out.println("CONTACT : "+contact);
		if(ch == 'c' || ch=='C')
			System.out.println("EMPLOYEE ASSIGNED : "+id);

	}
}
class Service
{
	int type;
	double service_charge;
	public void set()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("1.CAR  2.BIKE   3.BUS : ");
		type = in.nextInt();
		if(type == 1)
			service_charge = 500;
		else
		if(type == 2)
			service_charge=300;
		else
		service_charge = 800;
	}
	public void get()
	{
		System.out.print("TYPE : ");
		if(type == 1)
			System.out.println("CAR  ");
		else
		if(type == 2)
			System.out.println("BIKE  ");
		else
			System.out.println("BUS ");
		System.out.println("Service Charge : "+service_charge);
	}
	public static double calc(int t)
	{
		if(t==1)
			return 500;
		else
		if(t==2)
			return 300;
		else
			return 800;
	}
}

class Vehicle
{
	String brand;
	String color;
	Service service=new Service();
	public void set()
	{
		Scanner in = new Scanner(System.in);
		service.set();
		System.out.print("BRAND : ");
		brand = in.next();
		System.out.print("color : ");
		color = in.next();
	}
	public void get()
	{
		System.out.println("BRAND : "+brand);
		System.out.println("COLOR : "+color);
		service.get();
	}

}

class Invoice
{
	Person person;
	Vehicle vehicle;
	Invoice(Person p,Vehicle v)
	{
		p.display('c');
		v.get();
	}
}

public class Service_Station
{
	String sname;
	String address;
	int scontact;
	Service_Station(String n,String addr,int c)
	{
		sname = n;
		address = addr;
		scontact = c;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		char ch;
		List<Person> person = new ArrayList<Person>();
		List<Invoice> invoices = new ArrayList<Invoice>();


		System.out.println("SERVICE CHARGES : ");
		System.out.println("CAR : RS " + Service.calc(1));
		System.out.println("BIKE : RS " + Service.calc(2));
		System.out.println("BUS : RS " + Service.calc(3));

	System.out.println("ENTER THE DETAILS : ");
	do
	{
		Person p = new Person();
		int n = p.set();
		person.add(p);
		if(n==1)
		{
			Vehicle v = new Vehicle();
			v.set();
			Invoice i = new Invoice(p,v);
			invoices.add(i);
		}

		System.out.println("DO YOU WANT TO ADD ANOTHER EMPLOYEE / CUSTOMER ?? (Y/N) : ");
		ch = in.next().charAt(0);
	 } while(ch=='y' || ch=='Y');

	 System.out.println("LIST OF ALL EMPLOYEES");

	 for(Person p : person)
	 {
	 	if(p.getId()==null)
	 		p.display('e');
	 }

	 System.out.println("LIST OF ALL CUSTOMERS : ");
	 for(Person p : person)
	 {
	 	if(p.getId()!=null)
	 		p.display('c');
	 }


	}
}