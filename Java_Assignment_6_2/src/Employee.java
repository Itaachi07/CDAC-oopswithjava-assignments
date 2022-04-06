
public abstract class Employee {
	
	private String firstNameLastName;
	private int SSN;
	
	public abstract void earnings();
	

	public Employee(String firstNameLastName, int sSN) {
		super();
		this.firstNameLastName = firstNameLastName;
		SSN = sSN;
	}


	@Override
	public String toString() {
		return "Employee [firstNameLastName=" + firstNameLastName + ", SSN=" + SSN + "]";
	}

	
	
	

}
