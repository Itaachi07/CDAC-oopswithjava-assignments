package p1;

import java.util.Vector;

class GrowableStack extends FixedStack implements Stack
{
	Vector<String>data= new Vector<String>();
	int i=0;
	int j=0;
	public void push(String s)
	{
		i=data.size();
		data.add(i, s);
		System.out.println("************************************************************************");
		System.out.println("Pushed data is: "+data.get(i));
	}
	public void pop()
	{
		if (data.size()!=0)
		{
			j=data.size();
			String temp= data.get(j-1) ;
			data.remove(j-1);
			System.out.println("Poped data is: "+temp);
		}else System.out.println("Stack is empty");
	}
}