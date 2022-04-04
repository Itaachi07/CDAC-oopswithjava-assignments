class Employee
{
	String name;
	int id;
	double salary;
	
	public Employee()
	{
		
	}
	public Employee(String name, int id, double salary)
	{
		super();
		this.name="null";
		this.id=0;
		this.salary=0;
	}
	
	public String toString()
	{
		return ("Employee Name : " +name+" ID : "+id+" Salary : "+salary ) ;
		
	}
	public void push(Employee e)
	{
		System.out.println("Push Data " +e.toString());
	}
	public void pop()
	{
		
	}
}

interface Stack
{
	public void push(Employee e);
	public void pop();
	int STACK_SIZE=5;
}

class FixedStack implements Stack
{
	Stack<String>stk1= new Stack<String>();
	@Override
	public void push(Employee e)
	{
		stk1.push(e.toString());
	}
	public void pop()
	{
		stk1.pop();
	}
}

class GrowableStack extends FixedStack implements Stack
{
	
}

public class Java_Assignment_8_1 {

	public static void main(String[] args) {
		
	}

}
