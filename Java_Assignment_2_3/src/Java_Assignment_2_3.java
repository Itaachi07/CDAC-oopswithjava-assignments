/*
 Create a class called Date that includes three instance variables—a 
month (type int), a day (type int) and a year (type int). Provide a constructor 
that initializes the three instance variables and assumes that the values 
provided are correct. Provide a set and a get method for each instance
variable. Provide a method CC that displays the month, day and 
year separated by forward slashes (/). Write a test application named 
DateTest that demonstrates class Date’s capabilities
 */
import java.util.*;
class Date
{
	private int dd;
	private int mm;
	private int yy;
	
	public Date(int dd, int mm, int yy)
	{
		this.dd= dd;
		this.mm= mm;
		this.yy= yy;
		
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	void CC()
	{
		System.out.println("Date : "+dd+"/"+mm+"/"+yy);
	}
}

public class Java_Assignment_2_3 
{
	
}
