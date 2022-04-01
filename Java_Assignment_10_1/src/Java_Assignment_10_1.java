import java.io.File;
import java.io.IOException;

/*Write a Java program to check if a file or directory specified by pathname 
exists or no.*/

public class Java_Assignment_10_1 
{

	public static void main(String[] args) throws IOException 
	{
		String path= "hello.txt";
		File fobj= new File(path);
		boolean status = fobj.canRead();
		System.out.println("File is present: "+status);
		
	}

}
