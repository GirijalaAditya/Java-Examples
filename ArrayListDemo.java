import java.util.*;
class ArrayListDemo 
{
	public static void main(String args[]) 
	{
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " +al.size());
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add(1, "A");
		System.out.println("Size of al after additions: " +al.size());
		System.out.println("Contents of al: " + al);
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions: " +al.size());
		System.out.println("Contents of al: " + al);
	}
}

