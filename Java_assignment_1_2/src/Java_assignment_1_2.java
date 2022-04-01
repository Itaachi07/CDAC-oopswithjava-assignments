
import java.util.Scanner;

/*Accept 2 double values from User (using Scanner). Check data type. If 
arguments are not doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
*/
public class Java_assignment_1_2 

{
public static void main(String[]args)
{
	double avg=0;
	System.out.println("Enter first numbers");
	Scanner sc= new Scanner(System.in);
	boolean b1= sc.hasNextDouble();
	
	if (b1) 
	{
			double num1 = sc.nextDouble();
			System.out.println("Enter second numbers");
			boolean b2 = sc.hasNextDouble();
	  if(b2)
			{
		  double num2= sc.nextDouble();
		  avg = (num1+num2)/2;
		  System.out.println("Average is "+avg);
			}
	  else
			{
			System.out.println("Error");
			sc.close();
			}
	}
	else
	{
		System.out.println("Error");
		sc.close();
	}
}
}
