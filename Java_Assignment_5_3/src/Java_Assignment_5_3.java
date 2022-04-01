import java.util.StringTokenizer;

/* 	write a java program to count number of words in a String.
	Hint: You can use , trim() , length() and split() methods
 */
public class Java_Assignment_5_3 
{
	public static void main(String[]args)
	{
		int count1= 0;
		String s1= " Java is a simple langauge ";
		System.out.println("String length before trim:"+s1.length());
		s1=s1.trim();
		System.out.println("String length after trim:"+s1.length());
	
		String[] s2 = s1.split(" ");
		for(String s: s2)
		{
			count1++;
		}
		System.out.println("count1 :" +count1);
		
		//using String Tokenizer
		String str = "Good Morning, Have a nice day.";
		StringTokenizer stk= new StringTokenizer(str);
		int count = stk.countTokens();
		System.out.println("Count2 : " +count);
	
	}
}
