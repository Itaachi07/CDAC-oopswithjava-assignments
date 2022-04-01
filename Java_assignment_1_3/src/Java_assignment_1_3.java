import java.util.Scanner;

class Billing_calculator 
{
	String menu_name[] = {null, "Samosa", "Idli", "Dosa"};
	int menu_quantity[]= {0,0,0,0};
	int menu_price[]= {0,15,30,50};
	int menu_billing[]= {0,0,0,0};
	int menu_choice,menu_qty;

	 
	public Billing_calculator()
	{
		menu_choice=0;
		menu_qty=0;
	}
	void menu_selection()
	{
		Scanner sc=new Scanner(System.in);
	do {
		System.out.println(" 1: Samosa \n 2:Idali \n 3:Dosa \n 0:Generate Bill ");
		System.out.println("Enter the number of Item you would like to have");
		menu_choice=sc.nextInt();
		if (menu_choice==0 ) {break;}
		System.out.println("How much quantity of " +menu_name[menu_choice]+ " do you want:");
		menu_qty= sc.nextInt();
		menu_quantity[menu_choice]+=menu_qty;
		menu_billing[menu_choice]= menu_quantity[menu_choice]*menu_price[menu_choice];
		}
	while(menu_choice!=0);
		sc.close();
	}
	void print_Bill()
	 {
		for(int i=1; i<menu_name.length ; i++)
			System.out.println(menu_name[i]+ "\t\t" +menu_quantity[i]+"\t\t"+menu_billing[i]);
	 }
		
}
 
public class Java_assignment_1_3 
{
	public static void main(String[]args)
	{
		Billing_calculator b= new Billing_calculator();
		b.menu_selection();
		b.print_Bill();
	}
}
