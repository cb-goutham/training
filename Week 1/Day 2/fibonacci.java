import java.util.*;
public class Fibonacci{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("N :");	
		long n = in.nextInt();

		long a = 0;
		long b = 1;
		long c = a+b;
		if(n<=0)
			System.out.println("Enter number greater than 0");
		if(n==1)
			System.out.println(a);
		else
		if(n==2)
			System.out.println(a+" "+b);
		else
		{
			int cnt = 2;
			System.out.print(a+" "+b+" ");
			while(cnt<n)
			{
				c = a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
				cnt++;
			}

		}
	}
}