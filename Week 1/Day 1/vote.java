import java.util.*;
public class Vote
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("AGE :");
		int a = in.nextInt();

		if(a>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
			System.out.println("Not Eligible for voting");

	}
}