package ServiceStation;

public class Bus extends Vehicle
{
	Bus(String b,String c)
	{
		super(b, c);
	}

	public double getServiceCharge()
	{
		return 1000;
	}
}