import java.util.*;

class Student
{
	int studentid;
	String studentName;
	String gender;
	Subject subjects = new Subject();
	public void set()
	{
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		System.out.print("ID: ");
		studentid = in.nextInt();
		System.out.print("NAME: ");
		studentName = inp.next();
		System.out.print("GENDER[M/F]: ");
		gender= inp.next();
		subjects.set();
	}
	public float get()
	{
		System.out.println("Name : "+studentName);
		System.out.println("ID : "+studentid);
		System.out.println("gender : "+gender);
		subjects.get();
		float tot = subjects.total();
		return tot;

	}

}

class Subject
{
	String subject1,subject2,subject3;
	float mark1,mark2,mark3;
	public void set()
	{
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		System.out.print("SUB 1 : ");
		subject1 = in.next();
		System.out.print("Mark 1: ");
		mark1 = in.nextFloat();

		System.out.print("SUB 2 : ");
		subject2 = in.next();
		System.out.print("Mark 2: ");
		mark2 = in.nextFloat();

		System.out.print("SUB 3 : ");
		subject3 = in.next();
		System.out.print("Mark 3: ");
		mark3 = in.nextFloat();

	}
	public void get()
	{
		System.out.println(subject1+" : "+mark1 );
		System.out.println(subject2+" : "+mark2 );
		System.out.println(subject3+" : "+mark3 );

	}
	public float total()
	{
		return mark1+mark2+mark3;
	}
}


class ResultGenerator
{
	public static void generateResult(Student s)
	{
		System.out.println("REPORT CARD : ");
		float tot = s.get();
		System.out.println("TOTAL : "+tot);
		System.out.println("AVERAGE : "+tot/3);
	}
}


public class StudentDemo
{
	public void storestudentdate(Student s)
	{
		s.set();
	}
	public static void main(String[] args) 
	{
	StudentDemo d = new StudentDemo();	
	Student s = new Student();

	d.storestudentdate(s);
	ResultGenerator.generateResult(s);
	}
}
