class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread 1:"+i);
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{	
		for(int j=0;j<3;j++)
		{
			System.out.println("Thread 2:"+j);
		}
	}
}
class threadex1
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
	}
}	