import java.util.TreeSet;

/*Write a Java program to create a new tree set, add some colors (string) 
and print out the tree set*/
public class Java_Assignment_9_5 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Blue");
		ts.add("Green");
		ts.add("Black");
		System.out.println(ts);
	}

}
