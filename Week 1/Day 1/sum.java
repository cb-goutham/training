import java.util.* ;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Add two Numbers ");
		System.out.print("Enter the First Number  : ");
		int x = in.nextInt();
		System.out.print("Enter the Second Number : ");
		int y = in.nextInt();
		int z = x + y;
		System.out.println("Sum of the two numbers is : "+z);

	}
}