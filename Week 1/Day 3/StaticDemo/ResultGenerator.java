package StaticDemo;
import java.util.*;
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
