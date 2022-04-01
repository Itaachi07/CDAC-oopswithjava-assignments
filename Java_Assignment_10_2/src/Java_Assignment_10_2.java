import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*Write a Java program to store text file content line by line into an array*/
public class Java_Assignment_10_2 {

	public static void main(String[] args) throws IOException
	{
		String path=  "src/Text.txt";
		File fobj = new File(path);
		Scanner sc=new Scanner(fobj);
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Pratik");
		while(sc.hasNextLine())
		{
		ar.add(sc.nextLine());	
		}
		
		//System.out.println(fobj.canRead());
		for(String s:ar)
		System.out.println(s);
	}

}
