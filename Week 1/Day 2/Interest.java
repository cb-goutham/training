import java.util.*;
public class Interest{

	public static Double SimpleInterest(double p,double r,double t)
	{
		return ((p * r * t) / 100);
	}
	public static Double CompoundInterest(double p,double r,double t)
	{
		return (p* Math.pow((1 + (r/100)),t));

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	System.out.print("P :");
	double p = in.nextDouble();
	System.out.print("R :");
	double r = in.nextDouble();
	System.out.print("T :");
	double t = in.nextDouble();

	int ch ;
	System.out.println("1.SIMPLE INTEREST ");
	System.out.println("2.COMPOUND INTEREST ");
	System.out.print("Enter Your Choice : ");
	ch = in.nextInt();
	if(ch==1)
		System.out.println("YOUR SI IS : Rs "+SimpleInterest(p,r,t));
	else if(ch==2)
		System.out.println("YOUR CI IS : Rs "+CompoundInterest(p,r,t));
	else
		System.out.println("INVALID CHOICE");
		
	}
}