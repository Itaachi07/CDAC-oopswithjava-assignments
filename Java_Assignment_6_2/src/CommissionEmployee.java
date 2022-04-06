
public class CommissionEmployee extends Employee {
	
	int grossSales;
	double commitionRate;

	public CommissionEmployee(String firstNameLastName, int sSN, int grossSales, double commitionRate) {
		super(firstNameLastName,sSN);
		this.grossSales = grossSales;
		this.commitionRate = commitionRate;
	}
	
	public void earnings() {
		// TODO Auto-generated method stub
		System.out.println("This is Commission Employee");
		System.out.println("Salary:"+this.commitionRate*this.grossSales);
		
	}
	
	
	

}
