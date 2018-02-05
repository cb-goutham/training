package Animals.Birds;
import Animals.*;
public class Ostrich extends Bird implements Characteristics
{
	public Ostrich()
	{
		super("Ostrich");
		
	}
	
	public String fly()
	{
		return("NO");
	}
}