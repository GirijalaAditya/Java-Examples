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
}
class C extends B
{
	void m3()
	{
		System.out.println("Class C");
	}
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		obj1.m1();
		obj2.m1();
		obj2.m2();
		obj3.m1();
		obj3.m2();
		obj3.m3();
	}
}