/* 
 Create a class called Invoice that a hardware store might use to represent 
an invoice for an item sold at the store. An Invoice should include four 
pieces of information as instance variables—a part number (type String), a 
part description (type String), a quantity of the item being purchased (type 
int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the 
quantity by the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s 
capabilities.
 */
import  java.util.*;
 class Invoice {
	String part;
	String des;
	int quantity;
	double price;
	
	public Invoice(String part, String des, int quantity, double price) {
		this.part= part;
		this.des= des;
		this.quantity=quantity;
		this.price= price;
		
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity>0) {
		this.quantity = quantity;}
		else {
			this.quantity=0;
		}	
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0) {
	this.price = price;
		}
		else {
			this.price=0;
		}
	}
	
	void InvoiceTest()
	{	if (this.price<0 || this.quantity<0) {
		
		System.out.println("No invoice \nYour total bill is zero.");
		}
	else {
		System.out.println("The price of "+this.quantity+" "+this.des +" "+this.part+" is "+(price*quantity));
	}
	}
}
public class Java_Assignment_2_1 
{	
	
	}



