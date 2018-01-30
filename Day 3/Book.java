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
		System.out.println("Author : "+name);
		System.out.println("email : "+email);
		System.out.println("Gender :"+gender);
	}
	public static void main()
	{
		Author a = new Author("R K Narayanan","RKN@gmail.com",'M');
		a.toDisplay();
		a.Setemail("RK1234@gmail.com");
		a.toDisplay();
	}
}

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
		this.getAuthors();
	}

	public void addAuthors()
	{
		Scanner in = new Scanner(System.in);
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
		Scanner in = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		System.out.println("BOOK DETAILS");
		System.out.print("NAME : ");
		String b = in.next();
		System.out.print("Price : ");
		float p = inp.nextFloat();
		System.out.print("QTY : ");
		int q = inp.nextInt();

		Book book = new Book(b,p,q);
		book.addAuthors();
		book.toDisplay();


	}



}