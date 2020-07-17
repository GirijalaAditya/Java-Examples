class A  extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
try
{
if(i==2)  sleep(5000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("A:"+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=0;j<=5;j++)
{
System.out.println("B:"+j);
}
System.out.println("Exit from B");
}
}
class SleepTest
{
public static void main(String args[])
{
A a=new A();
B b=new B();
a.start();
b.start();
}
}
