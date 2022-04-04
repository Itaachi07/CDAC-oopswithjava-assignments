import java.util.TreeSet;

/*Write a program to create various Lists using Collection Framework.
Define a method to Find max number from ANY List of any numbers. 
Hint: compareTo()*/
public class Java_Assignment_9_4 {

	public static void main(String[] args) {
		TreeSet<Integer>ts= new TreeSet<Integer>();
		ts.add(15);
		ts.add(59);
		ts.add(49);
		ts.add(65);
		System.out.println(ts);
		System.out.println("Max number: "+ts.last());
		
		
		
	}

}
