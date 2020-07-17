import cal.calculator.*;
import java.util.*;
class calculation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		cal.calculator c=new cal.calculator();
		System.out.println("Enter value of a:");
		c.a=s.nextInt();
		System.out.println("Enter value of b:");
		c.b=s.nextInt();
		System.out.println("Sum is:"+c.add(c.a,c.b));
		System.out.println("Difference is:"+c.sub(c.a,c.b));
		System.out.println("Product is:"+c.mul(c.a,c.b));
		System.out.println("Division is"+c.div(c.a,c.b));
	}
}


	