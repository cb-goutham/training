package Exer3;
import java.io.*;
import java.util.*;
public class ReadText
{

	Map<String,Integer> words = new TreeMap<String,Integer>();	
	public void Read() throws IOException{
		
		Scanner s = null;
		try
		{
			s = new Scanner(new BufferedReader(new FileReader("./Exer3/input.txt")));

			while(s.hasNext())
			{
				String str = s.next();
				int count = words.containsKey(str) ? words.get(str) : 0;
				words.put(str,count + 1);
			}

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(s!=null)
				s.close();
		}
	}

	public  void Write() throws IOException {

    	PrintWriter printWriter = null;
		
		try{
				printWriter = new PrintWriter("./Exer3/output.txt");
			 	System.out.println(words);
    			
				for(Map.Entry<String,Integer> m : words.entrySet())
				{
					printWriter.flush();
					printWriter.println(m.getKey()+" : "+m.getValue());
					
				}
			}
		catch(IOException e)
		{
			System.err.println(e);
		}
		    
	finally{
		    	if(printWriter != null)
		    		printWriter.close();
		    }
		
		}
	}