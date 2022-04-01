import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee e1=new Employee("Pratik", "Satpute", 10000, 0);
		Employee e2= new Employee("Ash","Lee",0, 0);
		e1.disp();
		e1.raise();
		e2.disp();	
		e2.raise();

	}

}
