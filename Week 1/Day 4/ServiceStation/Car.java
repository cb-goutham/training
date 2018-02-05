package ServiceStation;
import java.util.*;
public class Car extends Vehicle
{
	Car(String b,String c)
	{

		super(b,c);
	}

	public double getServiceCharge()
	{
		return 500;
	}
}