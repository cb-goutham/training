import java.util.*;
public class Calendar
{
	public static void error()
	{
		System.out.println("DATE ENTERED IS INCORRECT");
		System.exit(0);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter the Date in dd/mm/yy format" );
		String date = in.next();
		String d[] = date.split("/");
		int dd = Integer.parseInt(d[0]);
		int mm = Integer.parseInt(d[1]);
		int yy = Integer.parseInt(d[2]);
		int n,nd,nm,ny;
		n=arr[mm-1];
		if(mm>12)
			error();
		if(mm==2)
		{
			if((yy%100)==0 &&(yy%400)==0)
				n=29;
			else
			if(yy%4==0)
				n=29;
		}
		if(dd > n)
			error();
			
		nd=dd+1;
		nm=mm;
		ny=yy;
		if(nd > n)
		{
			nd = 1;
			nm = nm+1;
		}
		if(nm>12)
		{
			nm=1;
			ny=ny+1;
		}
		System.out.println("NEXT DATE IS : "+nd+"/"+nm+"/"+ny);



	}
}