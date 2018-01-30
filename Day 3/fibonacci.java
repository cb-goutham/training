package day3;
import java.util.*;
public class fibonacci{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("N :");
		int n = in.nextInt();

		int a = 0;
		int b = 1;
		int c = a+b;
		if(n==0)
			System.out.println(a);
		else
		if(n==1)
			System.out.println(a+" "+b);
		else
		{
			System.out.print(a+" "+b+" ");
			while(true)
			{
				c = a+b;
				if(c>n)
					break;
				System.out.print(c+" ");
				a=b;
				b=c;
			}

		}
	}
}