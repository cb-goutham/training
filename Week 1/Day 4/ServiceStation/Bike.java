package ServiceStation;

public class Bike extends Vehicle
{
	Bike(String b,String c)
	{
		super(b , c);
	}

	public double getServiceCharge()
	{
		return 300;
	}
}