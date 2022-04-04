import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/*Sort the book details as per publish date and display it.*/
class Book implements Comparable<Book>
{
	String name;
	String category;
	double price;
	String author;
	int quantity;
	int id;
	int pubyear;
	public Book(String name, String category,double price,String author,int quantity,int id,int pubyear)
	{
		this.name=name;
		this.category=category;
		this.price=price;
		this.author=author;
		this.quantity=quantity;
		this.id=id;
		this.pubyear= pubyear;
	}
	@Override
	public int compareTo(Book o)
	{
		return this.pubyear-o.pubyear;
	}
	public int getPubyear() {
		return pubyear;
	}
	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() 
	{
		return ("Book Name: "+name+" \tGategory: "+category+" \tPrice: "+price+"\tAuthor Name:  "+author+ "\tQuantity: "+quantity+"\tId: "+id+" \tPublish Year "+pubyear );
		
	}
	
}
public class Java_Assignment_9_3 {

	public static void main(String[] args) 
	{
		ArrayList<Book> b=new ArrayList<Book>();
		b.add(new Book("Harry potter"," Fantasy", 350,"J K Rolling", 2,1565,1997));
		
		b.add(new Book("Harry potter 2"," Fantasy", 450,"J K Rolling", 5 ,15654,1998 ));
		
		b.add(new Book("Game of thrones"," Fantasy", 750,"JRR Martin", 1 ,15668,1996 ));
		
		b.add(new Book("Two States"," Drama", 250,"Chetan Bhagat", 3 ,15667,2009 ));
		
		b.add(new Book("General Aptitude"," Mathematics", 670,"R S Agrawal", 5 ,15658,2005 ));
		
		//TreeSet<Book> ts= new TreeSet<Book>();
		//ts.addAll(b);
		
		//System.out.println(b);
		Collections.sort(b);
		for (Book obj:b)
			System.out.println(obj);
		
			
	}

}
