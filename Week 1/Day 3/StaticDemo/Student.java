package StaticDemo;
import java.util.*;
public class Student
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
