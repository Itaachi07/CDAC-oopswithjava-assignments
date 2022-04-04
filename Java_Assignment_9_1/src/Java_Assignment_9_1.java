import java.util.HashSet;

/*Store book details in a library in hashing based data structure : HashSet
Book details : 
isbn(string),category(String),price(double),publishDate,authorName(string),quantity(int)
Unique ID : isbn
Accept at least 5 book details from user & display*/
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
public class Java_Assignment_9_1 {

	public static void main(String[] args) 
	{
		HashSet<Book> b=new HashSet<Book>();
		b.add(new Book("harry potter"," Fantasy", 350,"J K Rolling", 2,1565));
		
		b.add(new Book("harry potter 2"," Fantasy", 450,"J K Rolling", 5 ,15654 ));
		
		b.add(new Book("Game of thrones"," Fantasy", 750,"JRR Martin", 1 ,15668 ));
		
		b.add(new Book("Two States"," Drama", 250,"Chetan Bhagat", 3 ,15667 ));
		
		b.add(new Book("General Aptitude"," Mathematics", 670,"R S Agrawal", 5 ,15658 ));
		
		//System.out.println(b);
		for (Book obj:b)
			System.out.println(obj);
			
	}

}
