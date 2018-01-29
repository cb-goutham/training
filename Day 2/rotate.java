import java.util.*;
public class rotate{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("N-square matrix :");
		int n = in.nextInt();
	
		int[][] arr = new int[n][n];

		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=in.nextInt();

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

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
}