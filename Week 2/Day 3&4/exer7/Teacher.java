package exer7;
import java.util.*;
public class Teacher
{
	String id;
	String name;
	long salary;
	String doj;
	List<String> classesHandled;
	Teacher(String id,String name,String doj,long salary,List<String> classesHandled)
	{
		this.id=id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		this.classesHandled=classesHandled;
	}

	public void displayTeacher()
	{
		System.out.println("NAME :"+name);
		System.out.println("ID :"+id);
		System.out.println("Salary : "+salary);
		System.out.println("DATE OF JOINING :"+doj);
		System.out.println("CLASSES HANDLED :"+classesHandled);
	}

}