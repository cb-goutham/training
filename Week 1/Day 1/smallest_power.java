import java.util.*;
public class smallest_power
{
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.print("X :");
	int x = in.nextInt();	
	System.out.print("Y :");
	int y = in.nextInt();
	int cnt=1;
	int temp=x;
	while(x<y)
	{
		x=x*x;
		cnt++;
	}

	System.out.println("smallest_power of "+temp+" greater than "+y+"is :"+cnt);
	}
	
}