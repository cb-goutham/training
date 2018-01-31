import java.util.*;
interface characteristics 
{
	public String movement();
	public String type();
	public String fly();
}
abstract class Animal implements characteristics
{
	String name;
	Animal(String str)
	{
		name = str;
	}
}

abstract class Mammal extends Animal 
{

	public Mammal(String str)
	{
		super(str);
	}
	
}
abstract class Bird extends Animal
{
	public Bird(String n)
	{
		super(n);
	}
	
}
class Bat extends Mammal implements characteristics
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
class Dog extends Mammal implements characteristics
{
	public Dog()
	{
		super("Dog");
		
	}
	public String movement()
	{
		return ("LEGS");
	}
	public String type()
	{
		return("OMNIVORE");
	}
	public String fly()
	{
		return("NO");
	}

}
class Cow extends Mammal implements characteristics
{
	public Cow()
	{
		super("Cow");
		
	}

	public String movement()
	{
		return ("LEGS");
	}
	public String type()
	{
		return("HERBIVORE");
	}
	public String fly()
	{
		return("NO");
	}
}

class Ostrich extends Bird implements characteristics
{
	public Ostrich()
	{
		super("Ostrich");
		
	}
	public String movement()
	{
		return ("WINGS and LEGS");
	}
	public String type()
	{
		return("Carnivore");
	}
	public String fly()
	{
		return("NO");
	}
}
class Parrot extends Bird implements characteristics
{
	public Parrot()
	{
		super("Ostrich");
		
	}
	public String movement()
	{
		return ("WINGS");
	}
	public String type()
	{
		return("OMNIVORE");
	}
	public String fly()
	{
		return("YES");
	}
}


public class MyAnimal
{
	public static void main(String[] args) {
		char choice;
		List<Animal> animals = new ArrayList<Animal>();
		Scanner inp = new Scanner(System.in);
		do{
		int ch;
		System.out.println("1.BAT");
		System.out.println("2.DOG");
		System.out.println("3.COW");
		System.out.println("4.OSTRICH");
		System.out.println("5.PARROT");
		System.out.println("Enter your choice (1-5)");
		Scanner in = new Scanner(System.in);
		ch = in.nextInt();
		switch(ch)
		{
			case 1:
			{
				Bat b = new Bat();
				animals.add(b);
				break;
			}
			case 2:
			{
				Dog d = new Dog();
				animals.add(d);
				break;
			}
			case 3:
			{
				Cow d = new Cow();
				animals.add(d);
				break;
			}
			case 4:
			{
				Ostrich o = new Ostrich();
				animals.add(o);
				break;
			}
			case 5:
			{
				Parrot p = new Parrot();
				animals.add(p);
				break;
			}
			default:
			{
				System.out.println("WRONG INPUT");
			}
		}
		System.out.println("DO YOU WANT TO ADD ANOTHER SPECIES?(Y/N)");
		choice = inp.next().charAt(0);
	  }while(choice=='Y' || choice=='y');

	  System.out.println("LIST OF ANIMALS ADDED : ");
	  for(Animal a : animals)
	  {
	  	System.out.println(a.name);
	  }

	  System.out.println("HERBIVORES: ");
	  for(Animal a : animals)
	  {
	  	if(a.type()=="HERBIVORE")
	  		System.out.println(a.name);
	  }

	  System.out.println("ANIMALS THAT CAN FLY: ");
	  for(Animal a : animals)
	  {
	  	if(a.fly().equals("YES"))
	  		System.out.println(a.name);
	  }
	}
}

