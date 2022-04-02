package tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 
{
	public static void main (String[]args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many points you want");
		//int n = sc.nextInt();
		ArrayList<Point2D[]> a=new ArrayList<Point2D[]>();
		Point2D[] pi =new Point2D[sc.nextInt()];
		for (int i= 0;i<pi.length;i++)
		{
			System.out.println("Enter Co-ordinates for point :" +(i+1));
			 pi[i] = new Point2D(sc.nextInt(),sc.nextInt());
			 a.add(pi);
		}
		for (Point2D ele : pi)
			System.out.println(ele.getDetails());

		System.out.println("Enter choice");
		
		System.out.println("1. Display details of a specific point");
		System.out.println("2.Display details of all points");
		System.out.println("3.2 indices for the points & validate the indices");
		System.out.println("4.Exit");
		int choice = sc.nextInt();
		//do{
		switch (choice) 
		{
		case 1:
			do 
			{
			System.out.println("Enter index of point");
			int i =sc.nextInt();
			if (i<pi.length)
			{
				System.out.println(pi[i].getDetails());
				count=1;
			}
			else
				System.out.println("invalid Index,Plzz Retry Again");
			}while (count==0);
			break;
		case 2:
			//for(Point2D ele : pi)
				//System.out.println(ele.getDetails());
			for(int j=0;j<pi.length;j++)
			{
				System.out.println(pi[j].getDetails());
			}
			break;
		case 3:
			System.out.println("Enter Two Indices for the points");
	         int p1=sc.nextInt();
	         int p2=sc.nextInt();
	         if((p1<pi.length && p1>=0) && (p2<pi.length && p2>=0))
	        	
	        	 pi[p1].isEqual(pi[p2]);
	         else 
	        	 System.out.println("Invalid Indices");
			
			break;
		case 4:
			break;
		}
		//}while(choice!=4);	
	}
}
