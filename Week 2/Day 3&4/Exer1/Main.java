package Exer1;
import java.nio.file.*;
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Path");
		Scanner in = new Scanner(System.in);
		String path = in.next();
		Path dir = Paths.get(path);
		PrintFiles pf = new PrintFiles();
		try{
			Files.walkFileTree(dir,pf);
		}
		catch(IOException e){
			System.out.println(e);
		}
		pf.display();
	}
}