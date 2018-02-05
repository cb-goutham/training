package ServiceStation;
import java.util.*;
public abstract class Person
{
	String name;
	int age;
	int contact;
	Person(String name,int age,int contact)
	{
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	public String getName()
	{
		return name ;
	}
	public int getAge()
	{
		return age;
	}
	public int getContact()
	{
		return contact;
	}

}