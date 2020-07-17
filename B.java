class A
{
	void m1()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Class B");
	}
	public static void main(String args[])	
	{
		A obj1=new A();
		B obj2=new B();
		obj1.m1();
		obj2.m1();
		obj2.m2();
	}
}
