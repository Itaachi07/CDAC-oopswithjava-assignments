
public class BasePlusCommissionEmployee extends Employee {
	
	int grossSales;
	double commitionRate;
	double baseSalary;
	
	
	public BasePlusCommissionEmployee(String firstNameLastName, int sSN, int grossSales, double commitionRate,
			double baseSalary) {
		super(firstNameLastName,sSN);
		this.grossSales = grossSales;
		this.commitionRate = commitionRate;
		this.baseSalary = baseSalary;
	}
	
	public void earnings() {
		// TODO Auto-generated method stub
		System.out.println("This is Base Plus Commission Employee");
		System.out.println("Salary:"+((this.commitionRate*this.grossSales)+this.baseSalary));
		
	}
	
	public void hike() {
		this.baseSalary=this.baseSalary*1.1;
	}
	

}
