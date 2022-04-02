import java.util.ArrayList;

/*Write a Java program to replace the second element of a ArrayList with the specified element*/
public class Java_Assignment_8_03 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(20);
		a1.add(50);
		a1.add(8);
		System.out.println("Before : "+a1);
		a1.set(1, 25);
		
		System.out.println("After : "+a1);
		
	}

}
