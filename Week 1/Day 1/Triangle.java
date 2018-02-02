import java.util.*;

public class Triangle
{
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the lengths of three sides of the tringale");
	System.out.println("SIDE 1: ");	
	double x = in.nextDouble();
	System.out.println("SIDE 2: ");
	double y = in.nextDouble();
	System.out.println("SIDE 3: ");
	double z = in.nextDouble();

	if(x==y)
	{
		if(y==z)
			System.out.println("REGULAR");
		else
			System.out.println("SYMMETRIC");
	}
	else
	if(y==z)
		System.out.println("SYMMETRIC");
	else
	if(x==z)
		System.out.println("SYMMETRIC");
	else
		System.out.println("IRREGULAR");
  }
}