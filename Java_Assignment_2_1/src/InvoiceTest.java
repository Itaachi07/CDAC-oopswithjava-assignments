
public class InvoiceTest {
	public static void main(String[] args)
	{
		Invoice v1= new Invoice("Hammer", "Face Claw", -2, 550.50); 
		Invoice v2= new Invoice("Nails", "2 inch",220, 12.5); 
		Invoice v3= new Invoice("NUt and Bolts", "5 mm",220, 0);
		Invoice v4= new Invoice("Hammer", "Sledge",220, 2);
		v1.InvoiceTest();
		v2.InvoiceTest();
		v3.InvoiceTest();
		v4.InvoiceTest();
}
}
