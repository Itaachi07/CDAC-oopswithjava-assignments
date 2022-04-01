package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Point2D p1= new Point2D(4,2);
		Point2D p2= new Point2D(2,4);
		p1.getDetails();
		p2.getDetails();
		p1.calculateDistance(p2);
		p1.isEqual(p2);
		
	}

}
