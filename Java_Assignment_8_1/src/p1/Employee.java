package p1;

public class Employee {
	String name;
	int id;
	float salary;
	
	public Employee()
	{
		
	}
	public Employee(String name, int id, float salary)
	{
		super();
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return ("Employee Name : " +name+" ID : "+id+" Salary : "+salary ) ;
		
	}
}



