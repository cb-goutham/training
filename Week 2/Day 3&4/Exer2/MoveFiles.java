package Exer2;
import static java.nio.file.FileVisitResult.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
public class MoveFiles extends SimpleFileVisitor<Path>
{
     Path Dest;
	Map<String,Integer> files = new HashMap<String,Integer>();
	MoveFiles(Path d)
	{
		Dest = d;
	}
	public FileVisitResult visitFile(Path path,BasicFileAttributes attr) throws IOException
	{
		if(attr.isDirectory())
			return FileVisitResult.CONTINUE;

		String f = path.getFileName().toString();
		int cnt = files.containsKey(f) ? files.get(f) : 0;
		files.put(f,cnt + 1);
		System.out.println(cnt);
		try
		{
			Path d = Dest;
			if(cnt !=0 )
			{
				String s = path.getFileName().toString();
				s = s.substring(0,s.lastIndexOf("."))+"-"+Integer.toString(cnt)+s.substring(s.lastIndexOf("."));
				Files.move(path,d.resolve(s));
			}
			else
				Files.move(path,d.resolve(path.getFileName().toString()));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return FileVisitResult.CONTINUE;
	}

	public void display() throws IOException
	{
		System.out.println("\nCONTENTS INSIDE THE DESTINATION FOLDER \n");
		try
		{
			DirectoryStream<Path> stream = Files.newDirectoryStream(Dest);
			for(Path p : stream)
				System.out.println(p.getFileName());
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
	

}