import java.io.File;
import java.io.IOException;

/*Write a java program to find whether the file is Hidden file or not inside 
the directory. 
Hint : The IO package of java contains a special method named isHidden(*/
public class Java_Assignment_10_4 {

	public static void main(String[] args) throws IOException
	{
		String path = "sunbeam.txt";
		File fobj = new File(path);
		boolean status= fobj.isHidden();
		System.out.println("Is file hidden:"+status);
		

	}

}
