package StaticDemo;
import java.util.*;
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
