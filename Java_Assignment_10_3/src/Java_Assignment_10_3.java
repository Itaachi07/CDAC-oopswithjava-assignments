import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*Write a Java program to find the longest word in a text file*/
public class Java_Assignment_10_3 {
	public static void main(String[] args) 
	{
		String longest= "abc";
		
		String path= "src/world.txt";
		File fobj= new File(path);
		try {
		Scanner sc = new Scanner(fobj);
		while(sc.hasNext())
		{
		String current= sc.next();
		if (longest.length()<current.length())
		{ 
			longest=current;
		}
		}
		System.out.println(longest);
		
	}
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	}
}
