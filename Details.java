import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;	
import java.util.Set;
public class Details
{
	public static void main(String args[])
	{
		HashMap<Integer,String>hmap=new HashMap<Integer,String>();
		hmap.put(12,"Chaitanya");
		hmap.put(2,"Rahul");
		hmap.put(7,"Anil");
		hmap.put(49,"Ajeet");
		hmap.put(3,"Amit");
		Set set1=hmap.entrySet();
		Iterator iterator1=set1.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry e1=(Map.Entry)iterator1.next();
			System.out.println("Key is:"+e1.getKey()+"  & Value is: ");
			System.out.println(e1.getValue());
		}
		String var=hmap.get(2);
		System.out.println("Value at index 2 is:"+var);
		hmap.remove(3);
		System.out.println("Map key and values after removal:\n");
		Set set2=hmap.entrySet();
		Iterator iterator2=set2.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry e2=(Map.Entry)iterator2.next();
			System.out.println("Key is:"+e2.getKey()+"  & Value is: ");
			System.out.println(e2.getValue());
		}
	}
}