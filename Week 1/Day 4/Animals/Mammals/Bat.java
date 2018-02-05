package Animals.Mammals;
import Animals.*;
public class Bat extends Mammal implements Characteristics
{
	public Bat()
	{
		super("Bat");
		
	}
	public String movement()
	{
		return ("WINGS");
	}
	public String type()
	{
		return ("Carnivore");
	}
	public String fly()
	{
		return ("YES");
	}
}