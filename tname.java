class t1 extends Thread
{
public void run()
{
System.out.println("Running threadname is:"+Thread.currentThread().getName());
System.out.println("Running priority is:"+Thread.currentThread().getPriority());
}
}
class tname
{
public static void main(String args[])
{
t1 obj=new t1();
t1 obj1=new t1();
t1 obj2=new t1();
obj.setPriority(Thread.MIN_PRIORITY);
obj1.setPriority(Thread.MAX_PRIORITY);
obj2.setPriority(Thread.NORM_PRIORITY);
obj.start();
obj1.start();
obj2.start();
}
}