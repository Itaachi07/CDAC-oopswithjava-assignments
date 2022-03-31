
public class Java_Assignment_1_1 {
	public static void main(String[]args)
	{
		int num= Integer.parseInt(args[0]);
		System.out.println("given number: " +num );
		System.out.println("Binary equivalent: " +Integer.toBinaryString(num));
		System.out.println("Octal equivalent: " + Integer.toOctalString(num));
		System.out.println("hexadecimal equovalent: " + Integer.toHexString(num));
	
	}

}
