import java.util.*;
class Demo implements example1,example2
{
	public int add(int a,int b)
	{
		return(a+b);
	}
	public void display()
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a:");
		x=s.nextInt();
		System.out.println("Enter value of b:");
		y=s.nextInt();
		System.out.println("Sum is:"+add(x,y));
	}
	public int sub(int a,int b)
	{
		return(a-b);
	}
	public void show()
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a:");
		x=s.nextInt();
		System.out.println("Enter value of b:");
		y=s.nextInt();
		System.out.println("Difference is:"+sub(x,y));	
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.display();
		d.show();
	}
}
