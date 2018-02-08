package exer7;
import java.util.*;
public class Student
{
	String id;
	String name;
	String doj;
	String std;
	Map<String,Long> marks;
	Student(String id,String name,String doj,String std,Map<String,Long> marks)
	{
		this.id=id;
		this.name = name;
		this.std= std;
		this.doj = doj;
		this.marks=marks;
	}

	public void displayStudent()
	{
		System.out.println("NAME :"+name);
		System.out.println("ID :"+id);
		System.out.println("STD : "+std);
		System.out.println("DATE OF JOINING :"+doj);
		System.out.println("MARKS:"+marks);
	}

}