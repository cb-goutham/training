package Exer2;
import java.nio.file.*;
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Path from which all files must be moved");
		Scanner in = new Scanner(System.in);
		String source = in.next();
		System.out.println("Enter the Destination Folder");
		String Dest = in.next();
		Path src = Paths.get(source);
		Path dest = Paths.get(Dest);
		MoveFiles mf = new MoveFiles(dest);
		try{
			Files.walkFileTree(src,mf);
		}
		catch(IOException e){
			System.out.println(e);
		}

		mf.display();
		
	}
}