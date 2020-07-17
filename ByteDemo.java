import java.io.*; 
class ByteDemo
{
	public static void main(String args[])throws IOException
	{
		File in=new File("a1.txt");
		File out=new File("a2.txt");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream(in);
			fos=new FileOutputStream(out);	
			int c;
			while((c=fis.read())!=-1)
			{
				fos.write(c);
			}
		}
		finally
		{
			if(fis!=null)
			{
				fis.close();
			}
			if(fos!=null)
			{
				fos.close();	
			}
		}
	}
}
