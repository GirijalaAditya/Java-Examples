class stringex
{
	public static void main(String args[])
	{
		String s1="this is java class";
		String s2="engineering";
		String s3="HELLO";
		String s4="methodist college of engineering";
		String s5="methodist college of engineering";
		String s6="hello";
		String s7="HELLO";
		System.out.println(s1.length());
		System.out.println(s1.charAt(6));
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s2.replace('e','a'));
		System.out.println(s4.substring(5));
		System.out.println(s4.substring(2,8));
		System.out.println(s2.startsWith("e"));
		System.out.println(s2.endsWith("g"));
		System.out.println(s1.indexOf('c'));
		System.out.println(s4.lastIndexOf('a'));
		System.out.println(s4.equals(s5));
		System.out.println(s3.equalsIgnoreCase(s6));
		System.out.println(s3.compareTo(s6));
		System.out.println(s3.compareToIgnoreCase(s6));
		System.out.println(s3==s7);
}
}