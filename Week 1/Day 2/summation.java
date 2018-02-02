import java.util.*;
public class summation{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ENter the String :");
		String str = in.next();
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			sum += str.charAt(i) - 'a' +1 ; 
		}
		
		if(sum%2==0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}
}