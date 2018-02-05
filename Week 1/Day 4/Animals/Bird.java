package Animals;
import Animals.*;
public abstract class Bird extends Animal implements Characteristics
{
	public Bird(String n)
	{
		super(n);
	}
	public String movement()
	{
		return ("WINGS and LEGS");
	}
	public String type()
	{
		return("OMNIVORE");
	}

	public String fly()
	{
		return ("YES");
	}
	
}
