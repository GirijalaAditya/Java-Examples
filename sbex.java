class sbex
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("hello");
		StringBuffer s1=new StringBuffer("JAVA");
		StringBuffer s2=new StringBuffer("classes");
		StringBuffer s3=new StringBuffer("Engineering");
		StringBuffer s4=new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		System.out.println(s.length());
		System.out.println(s.capacity());
		s1.ensureCapacity(45);
		System.out.println(s1.capacity());
		s4.setLength(11);
		System.out.println(s4);
		System.out.println(s3.charAt(6));
		s1.setCharAt(0,'L');
		System.out.println(s1);
		System.out.println(s3.append("College"));
		System.out.println(s.reverse());
		System.out.println(s2.insert(0,"Python"));
		System.out.println(s3.deleteCharAt(4));
		System.out.println(s2.delete(2,4));
		System.out.println(s.replace(1,3,"WORLD OSMANIA"));
	}
}

