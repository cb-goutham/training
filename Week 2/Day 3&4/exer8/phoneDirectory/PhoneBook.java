package phoneDirectory;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.*;
import org.json.simple.JSONObject.*;
import org.json.simple.parser.*;
import java.io.*;
class PhoneBook
{

	static Map<String,List<Person>> phonebook = new HashMap<String,List<Person>>();

	public static void display(List<Person> p)
	{

		for(Person per : p)
			{
				System.out.println("\n"+per.getName());
				System.out.println(per.getAddress());
				System.out.println(per.getNumbers());
			}
	}

	public static String SearchNum(String num)
	{
		for(Map.Entry<String,List<Person>> ph : phonebook.entrySet())
				{
					for(Person per: ph.getValue())
					{
						Map<String,List<String>> nums = per.getNumbers();
						for(Map.Entry<String,List<String>> mp : nums.entrySet())
						{			
							for(String s : mp.getValue())
							{
								if(s.equals(num))
									return per.getName();
							}
						}
					}
				}
				return "NOT FOUND";
	}

	public static void main(String[] args) throws IOException,ParseException{
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		int ch ;
		JSONParser parser = new JSONParser();

	try
	{
		Object obj = parser.parse(new FileReader("./phoneDirectory/contacts.json"));
		JSONArray phnum = (JSONArray) obj;
	

		for(int i=0;i<phnum.size();i++)
		{
			JSONObject contact = (JSONObject)phnum.get(i);
			String name = (String)contact.get("Name");
			String address = (String)contact.get("Address");
			JSONArray ph = (JSONArray)contact.get("PhoneNumber");
			Iterator it = ph.iterator();
			List<String> list = new ArrayList<String>();
			while(it.hasNext())
			{
				Object no = it.next();
				JSONObject phno = (JSONObject) no;
				list.add(phno.get("Number").toString());
				list.add(phno.get("Type").toString());
			}

			Person p = new Person();
			p.addContact(name,address,list);
			if(phonebook.get(p.getName())==null)
				{
					List<Person> l = new ArrayList<Person>();
					l.add(p);
					phonebook.put(p.getName(),l);
				}
				else
					phonebook.get(p.getName()).add(p);
		}

	do
	{	
		System.out.println("1.SEARCH CONTACT BY NAME");
		System.out.println("2.SEARCH CONTACT BY NUMBER");
		System.out.println("3.EXIT");

		System.out.println("\n Enter Your CHoice : ");
		ch = inp.nextInt();
		switch(ch)
		{
			
			case 1 :
			{
				System.out.print("Enter the Name of the CONTACT : ");
				String name = in.next();
				phonebook.entrySet().stream().filter(ph -> ph.getKey().startsWith(name)).forEach(ph->display(ph.getValue()));
				break;
			}

			case 2:
			{
				System.out.print("Enter the Number  : ");
				String num = in.next();
				System.out.println(SearchNum(num));
				break;

			}

			case 3:
			{
				System.exit(0);
			}
		}
	}while(true);

	}

	catch(IOException e)
	{
		System.out.println(e);
	}
 }

}