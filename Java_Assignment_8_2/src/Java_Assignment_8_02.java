/* Write a Java program to create a new array list, add some colors (string) 
	and print out the collection as sorted list. */ 
import java.util.ArrayList;
import java.util.Collections;
public class Java_Assignment_8_02 
{
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Blue");
		str.add("Yellow");
		str.add("Purple");
		str.add("Pink");
		str.add("white");
		str.add("Black");
		System.out.println("String is :\t\t"+str);
		Collections.sort(str);
		//str.sort(null);
		System.out.println("Sorted String is :\t"+str);
	}

}
