
/* Create a class called Employee that includes three instance variables—a 
first name (type String), a last name (type String) and a monthly salary 
(double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly 
salary is not positive, do not set its value. Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities. Create two 
Employee objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again.
*/
import java.util.Scanner;
class Employee
	{
		private String name1;
		private String name2;
		private double salary;
		private double raise;
		public Employee(String name1,String name2, double salary, double raise)
		{
			this.name1=name1;
			this.name2=name2;
			if(salary>0) 
				{
				  this.salary=salary;
				}
			this.raise=raise;
		}

		public String getName1() {
			return name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2 = name2;
		}

		public double getSalary() {
			
			return salary;
		}

		public void setSalary(double salary) {
			if(this.salary>0) 
			{
			  this.salary=salary;
			}
		
		}
		void disp()
		{
			System.out.println("First name: " +this.name1+ "  Last name: "+this.name2+ "   Salary: "+this.salary);
		}
		void raise() 
		{
			
			if (this.salary>0)
				{this.salary= this.salary*1.1 ;
			System.out.println("Salary of " +this.name1+ " "+this.name2+" after raise: " +this.salary );}
			else
			{
				System.out.println("No raise for "+this.name1+ " " +this.name2);
			}
			//System.out.println("Salary of " +this.name1+ " " Last name: "+this.name2+ "   Salary: "+this.salary);
			System.out.println("Yearly salary of "+this.name1+ " is " +this.salary*12);
		}
	}
