import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//Practice Question
// 1. take name from user put it inside text file
// 2. take mobile number from user put it inside text file
// 3. take age , id, location from user put it inside text file
// 	you can add few more fields also 
// 4. Read the complete data from Text file 

public class UserInfo {
	static Scanner sc = new Scanner(System.in);
	static String path = "UserInfo.txt";
	
	public static int menuList()
	{
		System.out.println(" Enter Choice 0.Exit 1.Write 2.Read");
		return sc.nextInt();
	} 
	
	public static void writeRecord()throws Exception
	{
		try (BufferedWriter fw =new BufferedWriter (new FileWriter(new File(path))))
		{	
			System.out.println("Enter name");
			String name = sc.nextLine();
			fw.write(name);
			fw.newLine();
			
			System.out.println("Enter Mobile number");
			String mobno = sc.nextLine();
			fw.write(mobno);
			fw.newLine();
			
			System.out.println("Enter Age");
			String age = sc.nextLine();
			fw.write(age);
			fw.newLine();
			
			System.out.println("Enter ID");
			String id = sc.nextLine();
			fw.write(id);
			fw.newLine();
			
			System.out.println("Enter Location");
			String location = sc.nextLine();
			fw.write(location);
			fw.newLine();
		}
	}
	public static void read()throws Exception
	{
		try(BufferedReader fr =new BufferedReader (new FileReader(new File(path))))
		{
			String line;
			while((line=fr.readLine())!=null)
			{
				System.out.println(line);
			}
		}
	}
	public static void main(String[] args)throws Exception
	{
		int choice;
		while ((choice=menuList())!=0)
		{
			switch (choice)
			{
			case 1:
			 writeRecord();
			 break;
			case 2:
				read();
				break;
			}				
		}
	}
}
