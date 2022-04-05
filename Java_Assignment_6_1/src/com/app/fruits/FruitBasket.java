package com.app.fruits;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basket_size;
		int counter=0;
		int choice=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Basket Size:");
		basket_size= sc.nextInt();
		Fruit basket[]=new Fruit[basket_size];
		do {
			System.out.println("************************************");
			System.out.println("Chose: ");
			System.out.println("1.Mango \t 2.Orange \t 3.Apple ");
			System.out.println("4.Display names of all fruits in the basket");
			System.out.println("5.Display details of fruits in basket");
			System.out.println("6.Display taste");
			System.out.println("7.marke a Fruit as stale");
			System.out.println("8.Mark all sour Fruit stale");
			System.out.println("10.Exit");
			System.out.println("************************************");
			System.out.println("Enter Your choice:");
			choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				if (counter==basket_size-1)
				{
					System.out.println("basket is full");
					break;
				}
				basket[counter]=new Mango();
				counter++;
				break;
			case 2:
				if (counter==basket_size-1)
				{
					System.out.println("basket is full");
					break;
				}
				basket[counter]=new Orange();
				counter++;
				break;
			case 3:
				if (counter==basket_size-1)
				{
					System.out.println("basket is full");
					break;
				}
				basket[counter]=new Apple();
				counter++;
				break;
			case 4:
				System.out.println("Name of all Fruits");
				for(int i=0;i<counter;i++)
				{
					System.out.println(basket[i].getName());
				}break;
				
			case 5:
				System.out.println("List of fruit with details");
				for(int i=0;i<counter;i++)
				{
					System.out.println(basket[i].getName()+","+basket[i].getColor()+
							","+basket[i].getWeight()+","+basket[i].isFresh());
				}break;
			case 6:
				System.out.println("Taste of all stale fruits");
				for(int i=0;i<counter;i++)
				{
					if(basket[i].isFresh==false)
						System.out.println(basket[i].getName()+","+basket[i].taste());
				}break;
			case 7:
				System.out.println("Name of all Fruit");
				for (int i=0;i<counter;i++)
				{
					System.out.println("Index no:"+i+","+basket[i].getName());
				}
				int index;
				System.out.println("Enter Fruit index to mark it as stale");
				index=sc.nextInt();
				if(index<0||index>basket_size)
				{
					System.out.println("Wrong index entered");
					break;
				}
				else 
				{
					basket[index].setFresh(false);	
				}
			case 8:
				for(int i=0;i<counter;i++) {
					if(basket[i].taste().equals("sour"))
						basket[i].setFresh(false);

				}
				System.out.println("Marked all sour fruits stale");
				break;
				
			case 10:
				System.out.println("See You next time");
					break;
				
			}
			
		   }while(choice!=10);
		sc.close();
		
	}

}
