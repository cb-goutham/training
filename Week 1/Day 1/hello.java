class Hello
{
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			System.out.println("ALERT");
			System.exit(0);
		}
		System.out.println("hello world");	
	}
}