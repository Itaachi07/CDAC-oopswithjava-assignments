package credit;

import java.util.Scanner;

public class accountTest {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		account a = new account();
		
		System.out.println("Enter the account no.");
		int account_no=sc.nextInt();
		System.out.println("Enter balance at the beginning of the month");
		int bigi_balance =sc.nextInt();
		System.out.println("Enter total of all items charged by the customer this month");
		int items_charged =sc.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this month");
		int credits_applied =sc.nextInt();
		System.out.println("Enter allowed credit limit");
		int credit_limit =sc.nextInt();
		a.new_balance();
		a.setAccount_no(account_no);
		a.setItems_charged(items_charged);
		a.setCredits_applied(credits_applied);
		a.setCredit_limit(credit_limit);
		a.check();
	}

}
