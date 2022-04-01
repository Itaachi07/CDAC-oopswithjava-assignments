import java.util.Scanner;

/* Write a java code to check string is palindrome.*/
public class Java_Assignment_5_2 
{
	public static void main(String[]args)
	{	
		String str2="";
		System.out.println("Enter the word to check for Palindrome ");
		Scanner sc=new Scanner (System.in);
		String str1 =sc.next();
		int n = str1.length();
		for(int i=n-1;i>=0;i--)
			{
			str2 = str2+ str1.charAt(i);
			}
		if(str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("The word is Palindrome");
		}
		else 
			System.out.println("The word is not Palindrome");
		
	}
}