import java.util.*;
class UserDefException extends Exception
{
	public String s;
	public UserDefException(String s)
	{
		this.s=s;	
	}
	public String getMessage()
	{
		return s;
	}
}
public class UserDefExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			int age;
			System.out.println("Enter the Age:");
			Scanner s=new Scanner(System.in);
			age=s.nextInt();
			if(age<18)
			throw new UserDefException("Not Eligible for Voting");
			else
			System.out.println("Eligible for Voting");
		}
		catch(UserDefException e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}
}
	