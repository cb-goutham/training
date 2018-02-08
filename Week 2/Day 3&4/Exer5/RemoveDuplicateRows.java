package Exer5;
import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;
public class RemoveDuplicateRows
{
	
	public static void main(String[] args) throws IOException {

		Map<String,Integer> rec = new HashMap<String,Integer>();
		
		 try(
		 		BufferedReader reader = new BufferedReader(new FileReader("./Exer5/input.csv"));
		 		CSVParser csvParser = new CSVParser(reader,CSVFormat.DEFAULT);
		 		BufferedWriter writer = new BufferedWriter(new FileWriter("./Exer5/output.csv"));
		 		CSVPrinter csvPrinter = new CSVPrinter(writer,CSVFormat.DEFAULT);
		 	){

		 	Iterable<CSVRecord> csvRecords = csvParser.getRecords();

		 	for(CSVRecord records : csvRecords)
		 	{
		 		String str = records.get(0) + records.get(1) + records.get(2);
		 		if(rec.get(str) == null)
		 		{
		 			rec.put(str,1);
		 			csvPrinter.printRecord(records);

		 		}
		 	}
		 }

		 catch(IOException e)
		 {
		 	System.out.println(e);
		 }
	}
}