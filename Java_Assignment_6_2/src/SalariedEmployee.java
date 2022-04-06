
public class SalariedEmployee extends Employee {
	
	
	double weeklySalary;
	
	public SalariedEmployee(String fisrtNameLastName, int sSN, double weeklySalary) {
		super(fisrtNameLastName,sSN);
		this.weeklySalary = weeklySalary;
	}
	
	public void earnings() {
		// TODO Auto-generated method stub
		System.out.println("This is Salaried Employee");
		System.out.println("Weekly Salary:"+this.weeklySalary);
		
	}
	
	
	

}

