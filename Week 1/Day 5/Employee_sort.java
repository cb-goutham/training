import java.util.*;
import java.io.*;
class Employee
{
	private String name;
	private double salary;
	private int age;
	Employee(String n,double s,int a)
	{
		name = n;
		salary = s;
		age = a;
	}
	public String getname()
	{
		return name;
	}
	public double getsal()
	{
		return salary;
	}
	public int getage()
	{
		return age;
	}

}

public class Employee_sort
{
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("john",20000,34));
		emp.add(new Employee("cena",40000,40));
		emp.add(new Employee("mark",25000,27));


		System.out.println("SORT BY AGE");
		
		emp.sort((Employee e1,Employee e2)->e1.getage()-e2.getage());
		for(Employee e:emp)
		{
			System.out.println(e.getname()+"  "+e.getsal()+ " "+e.getage());
		}

		System.out.println("SORT BY SALARY");
		
		emp.sort((Employee e1,Employee e2)->{
			if(e1.getsal() < e2.getsal()) return -1;
			else if(e1.getsal() > e2.getsal()) return 1;
			else return 0;
		});
		for(Employee e:emp)
		{
			System.out.println(e.getname()+"  "+e.getsal()+ " "+e.getage());
		}

		System.out.println("SORT BY NAME");
		
		emp.sort((Employee e1,Employee e2)->e1.getname().compareTo(e2.getname()));
		for(Employee e:emp)
		{
			System.out.println(e.getname()+"  "+e.getsal()+ " "+e.getage());
		}

	}
}