package BookStall;
import java.util.*;
class Author
{
	String name;
	String email;
	char gender;
	Author(String n,String e,char g)
	{
		name = n;
		email = e;
		gender = g;
	}
	public String getName()
	{
		return name;
	}	
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	public void Setemail(String e)
	{
		email = e;
	}
	public void toDisplay()
	{
		System.out.println("["+name+"  "+email+"  "+gender+"]");
	}
	public static void main()
	{
		Author a = new Author("R K Narayanan","RKN@gmail.com",'M');
		a.toDisplay();
		a.Setemail("RK1234@gmail.com");
		a.toDisplay();
	}
}