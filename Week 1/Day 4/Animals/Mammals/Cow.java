package Animals.Mammals;
import Animals.*;
public class Cow extends Mammal implements Characteristics
{
	public Cow()
	{
		super("Cow");
		
	}

	public String type()
	{
		return("HERBIVORE");
	}
	
}