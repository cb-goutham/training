package Animals.Mammals;
import Animals.*;
public class Dog extends Mammal implements Characteristics
{
	public Dog()
	{
		super("Dog");
		
	}
	
	public String type()
	{
		return("OMNIVORE");
	}


}