package phoneDirectory;
import java.util.*;
class PhoneNumber
{
	Map<String,List<String>> numbers;
	PhoneNumber(List<String> num)
	{
		numbers = new HashMap<String,List<String>>();
		for(int i=0;i<num.size();i+=2)
		{
			if(!numbers.containKey(num.get(i+1)))
			{
				List<String> n = new ArrayList<>();
				n.add(num.get(i));
				numbers.put(num.get(i+1),n);
			}
			else
			{

				numbers.get(num.get(i+1)).add(num.get(i));
			}
		}
	}
	
	public Map<String,List<String>> getPhNumber()
	{
		return numbers;
	}

}