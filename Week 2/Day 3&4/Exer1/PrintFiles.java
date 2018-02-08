package Exer1;
//import org.apache.commons.io.*;
import static java.nio.file.FileVisitResult.*;
import java.nio.file.*;
import java.util.*;
import java.nio.file.attribute.BasicFileAttributes;
public class PrintFiles extends SimpleFileVisitor<Path>
{
	Map<String,Integer> files = new HashMap<String,Integer>();
	public FileVisitResult visitFile(Path path,BasicFileAttributes attr)
	{
		if(attr.isDirectory())
			return FileVisitResult.CONTINUE;

		String f = path.getFileName().toString();
		f = f.substring(f.lastIndexOf(".")+1);
		int cnt = files.containsKey(f) ? files.get(f) : 0;
		files.put(f,cnt + 1);
		return FileVisitResult.CONTINUE;
	}
	public void display()
	{
		System.out.println("\nEXTENSION \t COUNT\n");
		files.entrySet().stream().forEach(mp->System.out.println(mp.getKey()+"\t\t"+mp.getValue()));
		
	}

}