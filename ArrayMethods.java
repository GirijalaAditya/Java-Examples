import java.util.*;
class ArrayMethods
{
	public static void main(String args[])
	{
		int a[]={50,30,10,20,40};
		int b[]={50,30,10,20,40};
		System.out.println("Both arrays are equal:"+Arrays.equals(a,b));
		System.out.println("a values before sorting:");
		for(int a1 : a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("a values after sorting:");
		for(int a1 : a)
		{
			System.out.println(a1);
		}
		System.out.println(Arrays.binarySearch(a,10));
		System.out.println(Arrays.binarySearch(a,60));
	}
}