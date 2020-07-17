class Number
{
	int n1,n2,n3;
	public Number(int x,int y,int z)
	{
		n1=x;
		n2=y;
		n3=z;
	}
	public Number()
	{
		n1=5;
		n2=10;
		n3=15;
	}
	public Number(int x,int y)
	{
		n1=x;
		n2=y;
		n3=0;
	}
	void display()
	{
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		System.out.println("n3="+n3);
	}
	public static void main(String args[])
	{
		Number obj=new Number(1,2,3);
		obj.display();
		Number obj1=new Number();
		obj1.display();
		Number obj2=new Number(6,7);
		obj2.display();
	}
}
