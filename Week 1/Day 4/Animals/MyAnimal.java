package Animals;
import java.util.*;
import Animals.Birds.*;
import Animals.Mammals.*;

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

	  System.out.println("\n\nLIST OF ANIMALS ADDED : ");
	  for(Animal a : animals)
	  {
	  	System.out.println(a.name);
	  	
	  }

	  System.out.println("\n\nHERBIVORES: ");
	  int flag = 0;
	  for(Animal a : animals)
	  {
	  	if(a.type()=="HERBIVORE")
	  	{
	  		System.out.println(a.name); flag=1;
	  	}
	  }
	  if(flag==0)
	  	System.out.println("NONE");

	  flag = 0;
	  System.out.println("\n\nANIMALS THAT CAN FLY: ");
	  for(Animal a : animals)
	  {
	  	if(a.fly().equals("YES"))
	  	{
	  		System.out.println(a.name);
	  		flag =1 ;
	  	}
	  }
	  if(flag == 0)
	  	System.out.println("NONE");
	  
	}
}

