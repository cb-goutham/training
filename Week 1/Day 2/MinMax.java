import java.util.*;
public class MinMax{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	System.out.print("Enter the size of the array : ");
	int n = in.nextInt();
	Integer[] arr = new Integer[n];

	System.out.println("Enter the elements ");
	for(int i=0;i<n;i++)
		arr[i] = in.nextInt();

	int min = arr[0];
	int max = arr[0];

	for(int i=0;i<n;i++)
	{
		min = Math.min(min,arr[i]);
		max = Math.max(max,arr[i]);
	}
	System.out.println("MIN : "+min);
	System.out.println("MAX : "+max);
	
	/* 
	System.out.println("MIN : "+Collections.min(Arrays.asList(arr)));
	System.out.println("MAX : "+Collections.max(Arrays.asList(arr)));
	*/


	}
}