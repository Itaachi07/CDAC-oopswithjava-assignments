import java.util.Scanner;

/*Build a new Circle class with the following basic features:
 --Attributes:
o Center point - Build instance variables for the circle’s center point 
(myX and myY represented as double values).
o Diameter - Build an instance variable for the circle’s diameter (myDiameter also 
represented as a double value).
 --Behaviors
o Default constructor - Build a default constructor that initializes the circle’s center 
point to (0, 0) and its diameter to 100.
o Accessor methods - Build accessor methods for the two center coordinates and the 
diameter.
 --Invariant
o The circle’s diameter should always be non-negative. maintain the integrity of each 
circle object by ensuring that the class invariant (that the diameter should be nonnegative) is true at all times.
If the diameter is negative then throw user defined exception*/
class circle
{
	double myx;
	double myy;
	double mydiameter;
	public circle()
	{
		this.myx=0;
		this.myy=0;
		this.mydiameter=100;
		
	}
	public double getMyx() {
		return myx;
	}
	public void setMyx(double myx) {
		this.myx = myx;
	}
	public double getMyy() {
		return myy;
	}
	public void setMyy(double myy) {
		this.myy = myy;
	}
	public double getMydiameter() {
		return mydiameter;
	}
	public void setMydiameter(double mydiameter) {
		this.mydiameter = mydiameter;
	}
}
class NegeativeDiameterException extends Exception
{
	NegeativeDiameterException()
	{
		System.out.println("Diameter is Negative");
	}
}


public class Java_Assignment_7_2 {

	public static void main(String[] args) 
	{
		double d;
		Scanner sc= new Scanner(System.in);
		circle c = new circle();
		System.out.println("Enter the diameter");
		d= sc.nextDouble();
		c.setMydiameter(d);
		try 
		{
			if (c.getMydiameter()<0)
				throw new NegeativeDiameterException();
		}
		catch (NegeativeDiameterException e)
		{
			System.out.println("For Developer : ");
			e.printStackTrace();
		}
		finally {
			System.out.println(c.getMydiameter());
		}
	}

}
