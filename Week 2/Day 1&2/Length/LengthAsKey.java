package Length;
import java.util.*;
public class LengthAsKey
{
	public static void main(String[] args) {
		
	Map<Integer,List<String>> m  = new HashMap<Integer,List<String>>();
	Scanner in = new Scanner(System.in);
	in.useDelimiter(";");
	System.out.println("Enter the words separted by space. Press ; to stop entering");
	String str =in.next();

	String[] words = str.split(" ");
	for(String w : words)
	{
		if(m.get(w.length())==null)
		{
			List<String> l = new ArrayList<String>();
			l.add(w);
			m.put(w.length(),l);
		}
		else
			m.get(w.length()).add(w);
	}

	for(Map.Entry<Integer,List<String>> e : m.entrySet())
	{
		Integer key = e.getKey();
		List<String> val = e.getValue();
		System.out.println("Length : "+ key +"\t"+"WORDS :   "+ val);
	}

	
 }
}