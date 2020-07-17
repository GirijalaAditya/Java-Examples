import java.util.*;
class LinkedListDemo 
{
	public static void main(String args[]) 
	{
		LinkedList l= new LinkedList();
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("F");
		l.addLast("Z");
		l.addFirst("A");
		l.add(6, "G");
		System.out.println("Original contents of l: " + l);
 		l.remove("F");
		l.remove(2);
		System.out.println("Contents of l after deletion: "+ l);
		l.removeFirst();
		l.removeLast();
		System.out.println("l after deleting first and last: "+ l);
		System.out.println("First Element is:"+l.getFirst());
		System.out.println("Last Element is:"+l.getLast());
	}
}


