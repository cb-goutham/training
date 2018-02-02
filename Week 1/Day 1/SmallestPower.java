import java.util.*;
public class SmallestPower
{
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the 1st Number X : " );
	int x = in.nextInt();
	System.out.println("Enter the 2nd Number Y : ");
	int y = in.nextInt();
	if(x==1&& y>=1 || x==0 && y>0 )
	{
		System.out.println("NO POWER OF X EXIST THAT IS GREATER THAN Y");
		System.exit(0);
	}

	for(int i = 0;;i++)
	{
		if(Math.pow(x,i) > y)
		{
			System.out.println("SMALLEST POWER OF X GREATER THAN Y IS : " + i);
			break;
		}
	}
 }
}	