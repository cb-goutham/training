package Prefix;
import java.util.*;
public class PrefixAsKey
{
	public static void main(String[] args) {
		
	Map<String,List<String>> m  = new TreeMap<String,List<String>>();
	Scanner in = new Scanner(System.in);
	in.useDelimiter(";");
	System.out.println("Enter the words separted by space. Press ; to stop entering");
	String str =in.next();

	String[] words = str.split(" ");
	for(String w : words)
	{
		if(m.get(w.substring(0,3))==null)
		{
			List<String> l = new ArrayList<String>();
			l.add(w);
			m.put(w.substring(0,3),l);
		}
		else
		{
			m.get(w.substring(0,3)).add(w);
		}
	}

	for(Map.Entry<String,List<String>> e : m.entrySet())
	{
		String key = e.getKey();
		List<String> val = e.getValue();
		Collections.sort(val);
		System.out.println("Prefix : "+ key +"\t"+"WORDS :   "+ val);
	}
 }
}