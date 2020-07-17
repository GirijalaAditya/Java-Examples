import java.util.*;
public class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet h=new HashSet();
		h.add("Learning");
		h.add("Easy");
		h.add("Simply");
		Iterator iterator=h.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Value:"+iterator.next()+" ");
		}
	}
}