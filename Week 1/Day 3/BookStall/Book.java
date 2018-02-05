package BookStall;
import java.util.*;
class Book
{
	String bname;
	float price;
	int qtyInStock;
	List<Author> authors = new ArrayList<Author>();
	Book(String b,float p,int q)
	{
		bname = b;
		price = p;
		qtyInStock = q ;
	}
	public String getName()
	{
		return bname;
	}
	public float getPrice()
	{
		return price;
	}
	public void setprice(float p)
	{
		price = p;
	}
	public int getqty()
	{
		return qtyInStock;
	}
	public void setqty(int q)
	{
		qtyInStock = q;

	}
	public void getAuthors()
	{
		for(Author a: authors)
		{
			a.toDisplay();
		}
	}

	public void toDisplay()
	{
		System.out.println("BOOK NAME : "+this.getName());
		System.out.println("Price : "+this.getPrice());
		System.out.println("qtyInStock :"+this.getqty());
		System.out.println();
		System.out.println("AUTHORS : ");
		this.getAuthors();
	}

	public void addAuthors()
	{
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");
		char ch;
		do
		{
			System.out.println("Enter the Details of author");
			System.out.print("NAME : ");
			String n = in.next();
			System.out.print("email : ");
			String e = in.next();
			System.out.print("Gender : ");
			char g = in.next().charAt(0);
			Author ath = new Author(n,e,g);
			authors.add(ath);
			System.out.println("DO YOU WANT TO ADD ANOTHER AUTHOR");
		    ch = in.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		char ch ;
		do
		{
			Scanner in = new Scanner(System.in);
			in.useDelimiter("\n");
			Scanner inp = new Scanner(System.in);
			System.out.println();
			System.out.println("1.Add Book");
			System.out.println("2.Add AUthor");
			System.out.println("3.Get AUthor");
			System.out.println("4.Get all books available");
			System.out.println("5.EXIT");
			System.out.print("Enter Your Chocie : ");
			System.out.println();
			ch = in.next().charAt(0);
			switch(ch)
			{
				case '1':
					{
						System.out.println("BOOK DETAILS");
						System.out.print("NAME : ");
						String b = in.next();
						System.out.print("Price : ");
						float p = inp.nextFloat();
						System.out.print("QTY : ");
						int q = inp.nextInt();
						Book book = new Book(b,p,q);
						books.add(book);
						break;
					}
				case '2':
					{
						int flag=0;
						System.out.println("Enter the Book name to which you want to add Author");
						String bn = in.next();
						for(Book b : books)
						{
							if(b.getName().equals(bn))
							{
								flag=1;
								b.addAuthors();

							}
						}
						if(flag==0)
							System.out.println("NO BOOK FOUND");
						break;
					}
				case '3':
					{
						int flag =0;
						System.out.println("Enter the Book name to which you want to know the author info");
						String bn = in.next();
						for(Book b : books)
						{
							if(b.getName().equals(bn))
							{
								b.getAuthors();
								flag=1;
							}
						}	
						if(flag==0)
							System.out.println("NO BOOK FOUND");
						break;
					}
				case '4':
					{
						System.out.println("Books Available here : \n");
						for(Book b : books)
						{
							b.toDisplay();
						}
						break;
					}
				case '5':
					{
						System.out.println("Thank You... Visit Again");
						System.exit(0);
					}
				default :
				{
					System.out.println("Invalid Choice");
				}			
			}
		}while(true);
	}
}