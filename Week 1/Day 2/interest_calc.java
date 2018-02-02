import java.util.*;
public class interest_calc{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	System.out.print("P :");
	double p = in.nextDouble();
	System.out.print("R :");
	double r = in.nextDouble();
	System.out.print("T :");
	double t = in.nextDouble();

	double si = (p * r * t) / 100;
	double ci = p* Math.pow((1 + (r/100)),t);

	System.out.println("SIMPLE INTEREST :RS "+si);
	System.out.println("COMPOUND INTEREST :RS "+ci);
	 


	}
}