package p1;

public class FixedStack implements Stack
{
	static int i=0;
	String [] data =new String[STACK_SIZE];
	@Override
	public void push(String s)
	{
		if(data[(data.length)-1]==null)
		{
			data[i]=s;
			System.out.println("************************************************************************");
			System.out.println("Pushed data is: "+data[i]);
			++i;
			
		}else System.out.println("Stack is full");
	}
	@Override
	public void pop()
	{
		if (data[0]!=null)
		{
			int x=i;
			String temp=data[--x];
			data[--i]=null;
			System.out.println("poped data is: "+temp);
			
		}else System.out.println("Stack is empty");
	}
}