package Animals;
import java.util.*;
public class Animal
{
		static int count;
		String name;
		String locomotion;
		String foodBehaviour;
		public Animal(String str)
		{
			name = str;
			count++;
			
		}
		public void setLocomotion(String l)
		{
			locomotion = l;
		}
		public void setFoodBehaviour(String fb)
		{
			foodBehaviour = fb;
		}
		public String getLocomotion()
		{
			return locomotion;
		}
		public String getFoodBehaviour()
		{
			return foodBehaviour;
		}
		public String getanimalname()
		{
			return name;
		}

	public static void main(String[] args) {
	List<Animal> animals = new ArrayList<Animal>();
	Scanner in = new Scanner(System.in);
	Scanner inp = new Scanner(System.in);
	char ch;
	do
	{
		System.out.println("Enter the animal object name you want to create");
		String str = in.next();
		System.out.println("Locomotion - [1.Aerial 2.Terrestrial 3.Aquatic] ");
		int loc = inp.nextInt();
		System.out.println("Food Behaviour [1.Herbivore 2.Carnivore 3.Omnivore");
		int fb = inp.nextInt();
		Animal a = new Animal(str);

		if(loc == 1)
			a.setLocomotion("Aerial");
		else if(loc == 2)
			a.setLocomotion("Terrestrial");
		else a.setLocomotion("Aquatic");

		if(fb==1)
			a.setFoodBehaviour("Herbivore");
		else if(fb==2)
			a.setFoodBehaviour("Carnivore");
		else
			a.setFoodBehaviour("Omnivore");

		animals.add(a);
		System.out.println("DO you want to continue?(Y/N)");
		ch = inp.next().charAt(0);
	}while(ch=='Y' || ch =='y');	

	System.out.println("ANIMALS :");
	for(Animal a: animals)
		System.out.println("["+a.getanimalname()+" | "+a.getLocomotion()+" | "+a.getFoodBehaviour()+"]");
	System.out.println("\n Total Count : "+Animal.count);
	}



}
	
