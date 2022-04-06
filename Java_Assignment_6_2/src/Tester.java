
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1=new SalariedEmployee("Pratik",25,45000);
      Employee e2=new HourlyEmployee("Abc Xyz",12,350,8);
      Employee e3=new CommissionEmployee("Pqr Xyz",10,60000,0.4);
      Employee e4=new BasePlusCommissionEmployee("Lmn Xyz",56,60000,0.4,10000.0);
      e1.toString();
      e1.earnings();
      e2.toString();
      e2.earnings();
      e3.toString();
      e3.earnings();
      e4.toString();
      e4.earnings();
      System.out.println("Salary of Base plus Commission employee After 10% hike base salary");
      BasePlusCommissionEmployee b1=(BasePlusCommissionEmployee) e4;
      b1.hike();
      b1.earnings();
      
	}

}
