import java.util.HashSet;
import java.util.LinkedHashSet;

/*Store details from HashSet into LinkedHashSet , to confirm order of insertion*/
class Book
{
	String name;
	String category;
	double price;
	String author;
	int quantity;
	int id;
	public Book(String name, String category,double price,String author,int quantity,int id)
	{
		this.name=name;
		this.category=category;
		this.price=price;
		this.author=author;
		this.quantity=quantity;
		this.id=id;
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
		return ("Book Name: "+name+" Gategory: "+category+" Price: "+price+" Author Name:  "+author+ " Quantity: "+quantity+" Id: "+id);
		
	}
	
}
public class Java_Assignment_9_2 {

	public static void main(String[] args) 
	{
		HashSet<Integer> s= new HashSet<Integer>();
		s.add(42);
		s.add(453);
		s.add(6353);
		s.add(5733);
		LinkedHashSet<Integer> l= new LinkedHashSet<Integer>();
		 l.addAll(s);
		System.out.println(l);
		
		HashSet<Book> b=new HashSet<Book>();
		b.add(new Book("Harry potter "," Fantasy", 350,"J K Rolling", 2,1565));
		
		b.add(new Book("Harry potter 2"," Fantasy", 450,"J K Rolling", 5 ,15654 ));
		
		b.add(new Book("Game of thrones"," Fantasy", 750,"JRR Martin", 1 ,15668 ));
		
		b.add(new Book("Two States"," Drama", 250,"Chetan Bhagat", 3 ,15667 ));
		
		b.add(new Book("General Aptitude"," Mathematics", 670,"R S Agrawal", 5 ,15658 ));
		
		//System.out.println(b);
		LinkedHashSet<Book> i= new LinkedHashSet<Book>();
		i.addAll(b);
		//System.out.println(i);
		
		for (Book obj:i)
			System.out.println(obj);
			
	}

}
