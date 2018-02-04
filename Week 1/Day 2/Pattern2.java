import java.util.*;
public class Pattern2
{
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the no of lines for the Pattern");
	int n = in.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int k=n-i;k>0;k--)
			System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print("* ");
		System.out.println();
	}
	}
}