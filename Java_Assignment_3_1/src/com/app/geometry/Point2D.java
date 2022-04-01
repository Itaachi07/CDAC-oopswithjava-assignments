
package com.app.geometry;
import java.lang.Math;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x, double y)
	{
		this.x = x;
		this.y =y;
	}
	public String getDetails()
	{
		return "("+x+ ", "+y+")";
	}
	public void isEqual(Point2D n)
	{ 	if ((x== n.x)&&(y== n.y))
		{
		System.out.println("Both points have same co ordinates");
		}
	else {
			System.out.println("The distance between two points is "+(Math.sqrt(Math.pow(n.x-x,2)+(Math.pow(n.y-y,2)))));
	     }
				
	}
	public double calculateDistance(Point2D n)
	{
		//System.out.println(Math.sqrt(Math.pow(n.x-x,2)+(Math.pow(n.y-y,2))));
		//return  ;
		return (Math.sqrt(Math.pow(n.x-x,2)+(Math.pow(n.y-y,2))));
	}
}
