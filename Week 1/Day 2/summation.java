import java.util.*;
public class Summation{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ENter the String :");
		String str = in.next();
		int sum = 0;
		if(str==null || !str.matches("[a-zA-Z]+"))
		{	System.out.println("WRONG INPUT\n");
			System.exit(0);
		}

		for(int i=0;i<str.length();i++)
			sum += str.charAt(i) - 'a' +1 ;

		String res = (sum % 2 == 0) ? "EVEN" : "ODD"; 
		System.out.println("THE STRING IS : "+res);		
	}
}
