class MethodOverload
{
	void m1(int i)
	{
		System.out.println("First Function: "+i);
	}
	void m1(int i,int j)
	{
		System.out.println("Second Function: "+(i+j));
	}
	void m1(int i,int j,int k)
	{
		System.out.println("Third Function: "+(i+j+k));
	}
	public static void main(String args[])
	{
		MethodOverload obj=new MethodOverload();
		obj.m1(10);
		obj.m1(10,20);
		obj.m1(10,20,30);
	}
}