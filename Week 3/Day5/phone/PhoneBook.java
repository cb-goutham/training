package phone;
import java.util.*;
import org.apache.commons.csv.*;
import java.io.*;
import java.sql.*;
class PhoneBook
{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		jdbcConnect connect = new jdbcConnect();
		int ch ;
		try(
			BufferedReader reader = new BufferedReader(new FileReader("phone/contacts.csv"));
			CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);
			)
	{
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			for(CSVRecord records : csvRecords)
			{
				String name = records.get(0);
				String address = records.get(1);
				List<String> numbers = new ArrayList<>();
				for(int i=2;i<records.size();i++)
					numbers.add(records.get(i));
				connect.insertIntoTable(name,address,numbers);
			}
		do
		{

			System.out.println("1.ADD CONTACTS");
			System.out.println("2.SEARCH CONTACT WITH NAME");
			System.out.println("3.SEARCH CONTACT WITH NUMBER");
			System.out.println("4.MODIFY CONTACT");
			System.out.println("5.EXIT");
			System.out.print("ENTER YOUR CHOICE ");
			ch = in.nextInt();
			switch(ch)
			{
				case 1:
						{
							List<String> numbers = new ArrayList<>();
							System.out.println("NAME : ");
							String name = inp.next();
					
							System.out.println("ADDRESS : ");
							String address = inp.next();

							System.out.println("HOME : ");
							String home = inp.next();
							numbers.add(home);
							numbers.add("HOME");
							

							System.out.println("MOBILE : ");
							String mobile = inp.next();
							numbers.add(mobile);
							numbers.add("MOBILE");
							
							System.out.println("WORK : ");
							String work = inp.next();
							numbers.add(work);
							numbers.add("WORK");
							connect.insertIntoTable(name,address,numbers);
							break;
						}
				case 2:
						{
							System.out.print("Enter the Name : ");
							String name = inp.next();
							connect.search(name,null);
							break;
						}
				case 3:
						{
							System.out.print("Enter the Number : ");
							String num = inp.next();
							connect.search(null,num);
							break;
						}
				case 4:
						{
							char choice;
							System.out.println("Enter the Contact Name which You want to modify ");
							String cname = inp.next();
							do
							{
								System.out.println("1.MODIFY NAME : ");
								System.out.println("2.MODIFY ADDRESS : ");
								System.out.println("3.MODIFY MOBILE : ");
								System.out.println("4.MODIFY HOME : ");
								System.out.println("5.MODIFY WORK :");
								System.out.print("Enter the Choice : ");
								int ch1 = in.nextInt();
								switch(ch1)
								{
									case 1:
											{
												System.out.print("NEW NAME : ");
												String name = inp.next();
												connect.updateTable(cname, 1,name);
												break;
											}
									case 2:
											{

												System.out.print("NEW ADDRESS : ");
												String addr = inp.next();
												connect.updateTable(cname, 2,addr);
												break;
											}
									case 3:
											{
												System.out.print("NEW HOME : ");
												String h = in.next();
												connect.updateTable(cname, 3,h);
												break;
											}
									case 4:
											{
												System.out.print("NEW MOBILE : ");
												String m = in.next();
												connect.updateTable(cname, 4,m);
												break;
											}
									case 5:
											{
												System.out.print("NEW WORK : ");
												String w = in.next();
												connect.updateTable(cname, 5,w);
												break;
											}
								}
							System.out.println("DO YOU WANT TO CONTINUE ? (Y/N) ");
							choice = inp.next().charAt(0);	
							}while(choice == 'y' || choice == 'Y');
							break; 
						} 

				case 5:
				{
					System.exit(0);
				}

			}


		}while(true); 
	}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}