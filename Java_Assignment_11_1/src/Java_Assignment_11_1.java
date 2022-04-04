import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*Create a class Employee, having fields name, age, salary, empid, deptid. 
 Write parameterless and parameterized constructor. Specify getter and setter.
 Override toString(). Write two user defined methods accept_record() and disp_record(). 
 Write a main method which will display the Fields, constructor and methods information of the class Employee. 
 Hint: getFields() , getConstructor(), getMethods()*/
class Employee
{
	String name;
	int age;
	int empid;
	float salary;
	int deptid;
	public Employee()
	{
		
	}
	public Employee(String name, int age, int empid,int deptid, float salary)
	{
		this.name= name;
		this.age= age;
		this.empid= empid;
		this.salary=salary;
		this.deptid=deptid;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString()
	{
		return ("Employee :\n Name: "+name+" Age: "+age+" EmpID: "+empid+" Salary: "+salary+" DeptID: "+deptid);
	}
	void accept_record()
	{	
		Employee e= new Employee("Pratik",27,62758,60000,12);
		//Employee e1 = new Employee("Ash", 15,6258,70000,11);
	}
	void display_record()
	{
		
		System.out.println("Employee :\n Name: "+this.name+" Age: "+this.age+" EmpID: "+this.empid+" Salary: "+this.salary+" DeptID: "+this.deptid);
	}
}
public class Java_Assignment_11_1 
{
	
	
	public static void main(String[] args)throws Exception , NoSuchMethodException
	{
		Employee  e= new Employee("Pratik",27,62758,60000,12);
		e.accept_record();
		e.display_record();
		
		Class<Employee>cls= Employee.class;
		
		Constructor<Employee>constr=cls.getConstructor();
		System.out.println("Constructor:\t\t\t"+constr);
		
		constr = cls.getConstructor(String.class, int.class, int.class,int.class, float.class);
		System.out.println("parameterized constructor:\t"+constr);
		
		Field[] fl=cls.getDeclaredFields();
		System.out.println("Fields:\t\t\t\t");
		for(int i=0;i<fl.length;i++)
			System.out.println("\t"+fl[i].toString());
		
		
		Method[] m= cls.getDeclaredMethods();
		System.out.println("Method:\t\t\t\t");
		for(int i=0;i<m.length;i++)
			System.out.println("\t" +m[i].toString());
		
		
	}

}
