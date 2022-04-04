package credit;

public class account 
{
	int account_no;
	int bigi_balance;
	int items_charged;
	int credits_applied;
	int credit_limit;
	int new_balance;
	public account() { }
	
	public account(int account_no, int bigi_balance, int items_charged, int credits_applied, int credit_limit,int new_balance) 
	{
		this.account_no = account_no;
		this.bigi_balance = bigi_balance;
		this.items_charged = items_charged;
		this.credits_applied = credits_applied;
		this.credit_limit = credit_limit;
		this.new_balance = new_balance;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public int getItems_charged() {
		return items_charged;
	}

	public void setItems_charged(int items_charged) {
		this.items_charged = items_charged;
	}

	public int getCredits_applied() {
		return credits_applied;
	}

	public void setCredits_applied(int credits_applied) {
		this.credits_applied = credits_applied;
	}

	public int getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	
	public int new_balance() 
	{
		new_balance = (bigi_balance + items_charged - credits_applied );
		System.out.println("New Balance" +new_balance);
		return new_balance;
		
	}
	
	public void check()
	{
		if(new_balance > credit_limit)
			System.out.println("Credit Limit Exceeded.");
		else
			System.out.println("Credit is in limit.");
	}
	
		
	
	
	
	

	
	
	
	
}
