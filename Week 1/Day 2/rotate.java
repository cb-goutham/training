import java.util.*;
public class Rotate{
	static int[][] arr;
	static int n;
	public static void LeftRotate()
	{
		int t;
		for(int i=0;i<n/2;i++)
		{
			for(int j=i;j<n-i-1;j++)
			{
				t = arr[i][j];
				arr[i][j]=arr[j][n-i-1];
				arr[j][n-i-1]=arr[n-i-1][n-j-1];
				arr[n-i-1][n-j-1]=arr[n-j-1][i];
				arr[n-j-1][i]=t;
			}
		}

	}
	public static void RightRotate()
	{
		int t;
		for(int i=0;i<n/2;i++)
		{
			for(int j=i;j<n-i-1;j++)
			{
				t=arr[i][j];
				arr[i][j]=arr[n-j-1][i];
				arr[n-j-1][i]=arr[n-i-1][n-j-1];
				arr[n-i-1][n-j-1]=arr[j][n-i-1];
				arr[j][n-i-1]=t;

			}
		}

	}
	public static void display()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		System.out.print("N-square matrix :");
		n = in.nextInt();
	    arr = new int[n][n];
		System.out.println("Enter the matrix");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=in.nextInt();	
		System.out.println("1.LEFT ROTATE");
		System.out.println("2.RIGHT ROTATE");
		System.out.println("Enter Your Choice");
		int ch = in.nextInt();
		int t;
	if(ch==1)
	{
		LeftRotate();
		display();
	}
	else if(ch==2)
	{
		RightRotate();
		display();
	}
	else
		System.out.println("INVALID CHOICE");
		
	

		
  }
}