/*	Declare two Arrays of type String. Find the duplicate values of an array 
	of string values.
 */

public class Java_Assignment_4_2 
{
	public static void main(String[] args)
	{
		String[] arr1 = {"a","d","x","n","b"};
		String[] arr2 = {"c","b","a","d","z"};
		
		for (int i=0; i<arr1.length-1;i++)
		{
			for(int j=0; j<arr2.length ; j++)
			{	
				if((arr1[i]).equals(arr2[j]))
				{
					System.out.println("The duplicate elements are :"+arr1[i]);
					break;
				}
			}
		}
	}
}
