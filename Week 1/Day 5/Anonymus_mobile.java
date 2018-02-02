import java.util.*;
class Mobile
{
	private String name;
	private int remainingCharge;
	Mobile(String n)
	{
		name = n;
	}
    public void remaining_Charge()
    {
    	remainingCharge = 0;
    }
	public void name()
	{
		System.out.println("NAME : "+name);
	}
}

public class Anonymus_mobile
{
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung"){
			 public void remaining_Charge()
			{
				Random rand = new Random();
				System.out.println("REMAINING_CHARGE : "+rand.nextInt(100));
			}
		};
		m.name();
		m.remaining_Charge();
	
	}
}
