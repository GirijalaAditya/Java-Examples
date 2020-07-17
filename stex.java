import java.util.*;
class stex
{
public static void main(String args[])
{
String s="Java Classes";
StringTokenizer st=new StringTokenizer(s);
StringTokenizer st1=new StringTokenizer("my,name,is,aditya");
System.out.println(st.countTokens());
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
System.out.println(st1.nextToken(","));
}
}