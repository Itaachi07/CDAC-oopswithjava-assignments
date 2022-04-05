package p1;

import java.util.Scanner;

public class Test {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Employee e= new Employee();
		Scanner s= new Scanner(System.in);
		FixedStack fs= new FixedStack();
		GrowableStack gs = new GrowableStack();
		int option=0;
		while(option!=3) 
		{
			System.out.println("************************************************************************");
			System.out.println(" 1.Choose Fixed Stack \t 2.Choose Growable Stack \t 3.Exit");
			System.out.println("************************************************************************");
			System.out.println("Select Option:");
			option=s.nextInt();
			
			switch(option) 
		   {
			 
		   case 1:
		   int choice=0;
	    while(choice!=3) 
		   {
			 System.out.println("************************************************************************");
			 System.out.println("You have selected Fixed Stack. \n Select:");
			 System.out.println("1.To PUSH data.\t 2.To POP data.\t3.To EXIT current Stack selection");
			 System.out.println("************************************************************************");
			 choice=s.nextInt();
		
		if(choice==1) 
			{
			System.out.println("Enter Name:");
			e.setName(s.next());
			System.out.println("Enter Empid:");
			e.setId(s.nextInt());
			System.out.println("Enter Salary:");
			e.setSalary(s.nextFloat());
			String str= e.toString();
			fs.push(str);
			}
			else if(choice==2)
			{
			fs.pop();
			} 
		  }
			break;
		   
			   
			case 2:
			int choice1=0;
		while(choice1!=3) 
		  {
			System.out.println("************************************************************************");
			System.out.println("You have selected Growable Stack \n Select:");
			System.out.println("1.To PUSH data.\t 2.To POP data.\t3.To EXIT current Stack selection");
			System.out.println("************************************************************************");
			choice1=s.nextInt();
				
			if(choice1==1) 
		    {
				System.out.println("Enter Name:");
			    e.setName(s.next());
				System.out.println("Enter Empid:");
				e.setId(s.nextInt());
				System.out.println("Enter Salary:");
				e.setSalary(s.nextFloat());
				String str= e.toString();
				gs.push(str);
			}
				 
				else if(choice1==2)
				{
				  gs.pop();
				} 
		  }
	            break;
		 
		    }

		}
	  s.close();
	 }	

	}

