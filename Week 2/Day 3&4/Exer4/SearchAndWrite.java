package Exer4;
import java.io.*;
import java.util.*;
public class SearchAndWrite
{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = null;
		PrintWriter printWriter = null;
		Scanner in = new Scanner(System.in);
		String line;
		int countline = 0,flag=0;
		int StartIndex;
		System.out.println("ENTER THE WORD TO SEARCH IN THE FILE");
		String SearchWord = in.next();
		try
		{
			br = new BufferedReader(new FileReader("./Exer4/input.txt"));
			printWriter = new PrintWriter("./Exer4/"+SearchWord+".txt");
			while((line=br.readLine())!=null)
			{
				countline++;
				StartIndex =0;
				flag=0;
				String[] words = line.split(" ");
				for(String word : words)
				{
					
					if(word.equals(SearchWord))
					{
							printWriter.flush();
							if(flag==0)
							{
								printWriter.print(countline+" : "+StartIndex);
							}
							else
								printWriter.print(","+StartIndex);
							flag=1;
							
						}
					StartIndex=StartIndex + word.length()+1;
					
				}
				if(flag==1)
					printWriter.println(".");


			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			if(br!=null)
				br.close();
			if(printWriter!=null)
				printWriter.close();
		}
	}
}