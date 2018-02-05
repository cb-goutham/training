package StaticDemo;
import java.util.*;
public class Subject
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