
public class HourlyEmployee extends Employee {
	
	double wage;
	double hours;
	
	public HourlyEmployee(String firstNameLastName, int sSN, double wage, double hours) {
		super(firstNameLastName,sSN);
		this.wage = wage;
		this.hours = hours;
	}
	
	public void earnings() {
		// TODO Auto-generated method stub
		System.out.println("This is Hourly Employee");
		if(this.hours<=40)
			System.out.println("Salary:"+this.hours*this.wage);
		else if(this.hours>40)
		{
			System.out.println("Salary:"+40*this.wage+(this.hours-40)*wage*1.5);
		}
		
	}
	
	

}
