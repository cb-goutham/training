import java.util.*;

public class animal
{
		String name;
		public animal(String str)
		{
			name = str;
			
		}
		public String getanimalname()
		{
			return name;
		}

	public static void main(String[] args) {
	List<animal> animals = new ArrayList<animal>();
	Scanner in = new Scanner(System.in);
	Scanner inp = new Scanner(System.in);
	char ch;
	do
	{
		System.out.println("Enter the animal object name you want to create");
		String str = in.next();
		animal a = new animal(str);
		animals.add(a);
		System.out.println("DO you want to continue?(Y/N)");
		ch = inp.next().charAt(0);
	}while(ch=='Y');	

	System.out.println("ANIMALS :");
	for(animal a: animals)
		System.out.println(a.getanimalname());
	}
}
	
