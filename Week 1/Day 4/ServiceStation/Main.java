package ServiceStation;
import java.util.*;
public class Main
{
	String sname;
	String address;
	int scontact;
	Main(String n,String addr,int c)
	{
		sname = n;
		address = addr;
		scontact = c;
	}
	public static void main(String[] args) 
	{

		int num;
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		char ch;
		int t;
		List<Customer> customers = new ArrayList<Customer>();
		List<Employee> employees = new ArrayList<Employee>(); 
		List<Invoice> invoices = new ArrayList<Invoice>();
do
{
	System.out.println("\n1.ADD CUSTOMERS");
	System.out.println("2.ADD EMPLOYEES");
	System.out.println("3.PRINT INVOICE FOR A CUSTOMER");
	System.out.println("4.LIST ALL EMPLOYEES");
	System.out.println("5.List ALL CUSTOMERS");
	System.out.println("6.Exit");
	System.out.print("Enter Your Choice : ");
	num = inp.nextInt();
	switch(num)
	{
		case 1:
		{
		 do
			{
				
				System.out.println("Enter the Person details : ");
				System.out.print("NAME : ");
				String n = in.next();
				System.out.print("AGE : ");
				int a = inp.nextInt();
				System.out.print("CONTACT : ");
				int con = inp.nextInt();
				Customer cust = new Customer(n,a,con);
				customers.add(cust);
				
					System.out.println("What You Want to Get Serviced ? (1.Car 2.Bike 3.Bus) : ");
					t = inp.nextInt();
					System.out.print("BRAND : ");
					String br = in.next();
					System.out.print("COLOR : ");
					String co = in.next();

					if(t == 1)
					{
						Car ob = new Car(br,co);
						Invoice i = new Invoice(cust,ob);
						invoices.add(i);
					}
					else if(t==2)
					{
						Bike ob = new Bike(br,co);
						Invoice i = new Invoice(cust,ob);
						invoices.add(i);

					}
					else
					{
						Bus ob = new Bus(br,co);
						Invoice i = new Invoice(cust,ob);
						invoices.add(i);
					}

				System.out.println("DO YOU WANT TO ADD ANOTHER CUSTOMER ?? (Y/N) : ");
				ch = in.next().charAt(0);
	 		} while(ch=='y' || ch=='Y');
	 		break;

		}

		case 2:
		{
			do
			{
				
				System.out.println("Enter the Person details : ");
				System.out.print("NAME : ");
				String n = in.next();
				System.out.print("AGE : ");
				int a = inp.nextInt();
				System.out.print("CONTACT : ");
				int con = inp.nextInt();
				Employee e = new Employee(n,a,con);
				employees.add(e);
				System.out.println("DO YOU WANT TO ADD ANOTHER EMPLOYEE ?? (Y/N) : ");
				ch = in.next().charAt(0);
	 		} while(ch=='y' || ch=='Y'); break;
		}

		case 3:
		{
			System.out.print("Enter the Customer Name : ");
			String cus = in.next();
			int flag =0;
			for (Invoice i : invoices)
				{
					if(i.getname().equals(cus))
					{
						i.getInvoice();
						flag = 1;
					}
				}
			if(flag == 0)
				System.out.println("NO CUSTOMER FOUND\n");
			break;
		}

		case 4:
		{
			System.out.println("\nLIST OF ALL EMPLOYEES");
	 		for(Employee p : employees)
			 {
	 				p.getter();
	 		  }
	 		  break;
		}

		case 5:
		{
			System.out.println("\nLIST OF ALL CUSTOMERS : ");
	 		for(Customer p : customers)
	 		{
	 			p.getter();
	 		}
	 		break;

		}
		case 6:
		{
			System.exit(0);
		}
		default :
		{
			System.out.println("Invalid Choice\n");
		}
	 }
 	}	while(true);
  }
}