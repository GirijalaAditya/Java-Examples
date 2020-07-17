import java.util.*;
abstract class shape
{
	int a,b;
	float PrintArea()
	{
		return 0;
	}
}
class rectangle extends shape
{
	rectangle(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Area of rectangle:"+PrintArea());
	}
	float PrintArea()
	{
		float rarea;
		rarea=(float)(a*b);
		return rarea;
	}
}
class triangle extends shape
{
	triangle(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Area of triangle:"+PrintArea());
	}
	float PrintArea()
	{
		float tarea;
		tarea=(float)((a*b)/2);
		return tarea;
	}
}
class circle extends shape
{
	circle(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Area of circle:"+PrintArea());
	}
	float PrintArea()
	{
		float carea;
		carea=(float)(3.1415)*(a*a);
		return carea;
	}
}
class AreaDemo
{
	public static void main(String args[])
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x:");
		x=s.nextInt();
		System.out.println("Enter value of y:");
		y=s.nextInt();
		rectangle r=new rectangle(x,y);
		triangle t=new triangle(x,y);
		circle c=new circle(x,y);
	}
}
