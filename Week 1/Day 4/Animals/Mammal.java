package Animals;
import Animals.*;
public abstract class Mammal extends Animal implements Characteristics
{

	public Mammal(String str)
	{
		super(str);
	}
	public String fly()
	{
		return ("NO");
	}
	public String movement()
	{
		return ("LEGS");
	}
}