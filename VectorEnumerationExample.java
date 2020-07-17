import java.util.*;
import java.util.Enumeration;
public class VectorEnumerationExample
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add("JAVA");
		v.add("MPI");
		v.add("CO");
		v.add("M&S");
		v.add("Mini Project");
		Enumeration e=v.elements();
		System.out.println("Vector Elements are:");
		while(e.hasMoreElements())
		System.out.println(e.nextElement());
	}
}