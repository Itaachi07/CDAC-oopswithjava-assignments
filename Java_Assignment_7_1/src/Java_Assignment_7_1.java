/*Define a new exception, called ExceptionLineTooLong, that prints out the error message "The 
strings is too long". Write a program that reads a String from user and calculates its length. and throws 
an exception of type ExceptionLineTooLong in the case where a string of length is more than 80 
characters.*/
import java.util.Scanner;
class ExceptionLineTooLong extends Exception{
	ExceptionLineTooLong()
	{
		System.out.println("The strings is too long");
	}	
}
public class Java_Assignment_7_1 {

	
	public static void main(String[] args) 
	{	
		try
		{
			System.out.println("Enter The string");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
		if ((str.length())>80)
		{
			throw new ExceptionLineTooLong();			
		}
		else
		{
			System.out.println(str);
		}
		}
		catch (ExceptionLineTooLong e)
		{
			System.out.println(e);
		}
				

	}

}
