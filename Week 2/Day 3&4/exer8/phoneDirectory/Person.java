package phoneDirectory;
import java.util.*;
class Person
{
	private String name;
	private String address;
	private PhoneNumber numbers ;
	
	public void addContact(String name,String address,List<String> num)
	{
		this.name = name;
		this.address = address;
		numbers = new PhoneNumber(num);
		
	}

	public String getName()
	{
		return this.name;
	}
	public String getAddress()
	{
		return this.address;
	}

	public Map<String,List<String>> getNumbers()
	{
		Map<String,List<String>> num = numbers.getPhNumber();
		return num;
	}




}