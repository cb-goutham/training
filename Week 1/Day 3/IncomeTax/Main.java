package IncomeTax;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		int ch;
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
	do
	{
		System.out.println("\n1.Add Employee");
		System.out.println("2.Calculate Tax");
		System.out.println("3.List all employees");
		System.out.println("4.Exit");
		System.out.print("Enter Your Choice : ");
		ch = in.nextInt();
		switch(ch)
		{
			case 1:
			{
				char c ;
				do
				{
				Employee e = new Employee();
				e.setter();
				employees.add(e);
				System.out.println("Do You Want to Add another Employee (Y/N)");
				c = inp.next().charAt(0);
				}while(c=='y'||c=='Y');
				break;
			}
			case 2:
			{
				String eid;
				int flag=0;
				System.out.print("Enter the Employee ID : ");
				eid = in.next();
				for(Employee e : employees)
				{
					if(e.getId().equals(eid))
					{
						System.out.println("Your Tax Amt is : Rs "+IncomeTaxGenerator.calcTax(e));
						flag =1;
					}
				}
				if(flag==0)
					System.out.println("NO Employee Found");
				break;
			}
			case 3:
			{
				for(Employee e : employees)
				{
					e.display();
				}
				break;
			}
			case 4:
			{
				System.exit(0);
			}
			default:
			{
				System.out.println("INVALID CHOICE");
			}

		}
	}while(true);


	}
}